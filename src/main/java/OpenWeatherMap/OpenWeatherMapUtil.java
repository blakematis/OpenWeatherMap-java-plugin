package OpenWeatherMap;

import JSON.JSONReader;

import javax.json.*;
import java.net.MalformedURLException;

public class OpenWeatherMapUtil {

    public OpenWeatherMapUtil(){

    }

    public static JsonObject jsonReply(String API_URL) throws MalformedURLException {
        return JSONReader.getJsonReply(API_URL);
    }


    public static CurrentForecast buildCurrentForecast(String API_URL) throws MalformedURLException {
        return (CurrentForecast) new CurrentForecast().build(jsonReply(API_URL));}

    public static Wind buildWind(String API_URL) throws MalformedURLException {
        return (Wind) new Wind().build(jsonReply(API_URL));}

    public static City buildCity(String API_URL) throws MalformedURLException {
        return new City().build(jsonReply(API_URL));
    }

    public static Weather buildWeather(String API_URL) throws MalformedURLException {
        return (Weather) new Weather().build(jsonReply(API_URL));
    }

    public static Coord buildCoord(String API_URL) throws MalformedURLException {
        return (Coord) new Coord().build(jsonReply(API_URL));
    }

    public static Forecast buildForecast(String API_URL, int index) throws MalformedURLException {
        return (Forecast) new Forecast().build(jsonReply(API_URL), index);}

    public static Clouds buildClouds(String API_URL, int i) throws MalformedURLException {
        return (Clouds) new Clouds().build(jsonReply(API_URL), i);
    }

}
