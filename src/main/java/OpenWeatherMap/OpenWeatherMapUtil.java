package OpenWeatherMap;

import JSON.JSONReader;
import com.sun.istack.internal.NotNull;

import javax.json.*;
import java.net.MalformedURLException;
import java.net.URL;

public class OpenWeatherMapUtil {

    private String api_url = "https://api.openweathermap.org/data/2.5/forecast?zip=";
    private int zipCode;
    private String api_key = "&units=imperial&appid=e513347207aae03c792f055e744790e4";
    private URL url;
    private JSONReader jsonReader;

    public OpenWeatherMapUtil(){

    }

    public static JsonObject jsonReply(String API_URL) throws MalformedURLException {
        return JSONReader.getJsonReply(API_URL);
    }

    /*
    public WeatherForecast createForeCast(){

        JsonReader reader = jsonReader.getJsonReader();
        WeatherForecast weatherForecast = new WeatherForecast();
        weatherForecast.setCity(buildCity(reader));
        reader.close();
        return  weatherForecast;
    }
    */

    public static Wind buildWind(JsonObject jsonObject){ return (Wind) new Wind().build(jsonObject);}

    public static City buildCity(JsonObject jsonObject){
        return new City().build(jsonObject);
    }

    public static MainForecast buildMainForecast(JsonObject jsonObject, int index) { return (MainForecast) new MainForecast().build(jsonObject);}

    public OpenWeatherMapUtil(URL url){
        this.url = url;
    }

    public String getApi_url() {
        return api_url;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getApi_key() {
        return api_key;
    }

    public URL getUrl() {
        return url;
    }
}
