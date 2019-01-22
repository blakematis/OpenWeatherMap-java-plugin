package OpenWeatherMap;

import JSON.JSONReader;
import com.sun.istack.internal.NotNull;

import javax.json.JsonNumber;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonString;
import java.net.URL;

public class OpenWeatherMapUtil {

    private String api_url = "https://api.openweathermap.org/data/2.5/forecast?zip=";
    private int zipCode;
    private String api_key = "&units=imperial&appid=e513347207aae03c792f055e744790e4";
    private URL url;
    private JSONReader jsonReader;

    public OpenWeatherMapUtil(int zipCode) throws Exception{
        this.zipCode = zipCode;
        this.url = new URL(api_url + zipCode + api_key);
        this.jsonReader = new JSONReader(url);
    }

    public WeatherForecast createForeCast(){
        JsonReader reader = jsonReader.getJsonReader();
        WeatherForecast weatherForecast = new WeatherForecast();
        weatherForecast.setCity(buildCity(reader));
        reader.close();
        return  weatherForecast;
    }

    public static City buildCity(JsonReader reader){
        return new City().build(reader);
    }

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
