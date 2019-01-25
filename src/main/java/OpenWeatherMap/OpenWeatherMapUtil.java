package OpenWeatherMap;

import JSON.JSONReader;

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


    public static Wind buildWind(JsonObject jsonObject){ return (Wind) new Wind().build(jsonObject);}

    public static City buildCity(JsonObject jsonObject){
        return new City().build(jsonObject);
    }

    public static Forecast buildMainForecast(JsonObject jsonObject, int index) { return (Forecast) new Forecast().build(jsonObject, index);}

    public OpenWeatherMapUtil(URL url){
        this.url = url;
    }

    public static Clouds buildClouds(JsonObject jsonObject) {
        return (Clouds) new Clouds().build(jsonObject);
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
