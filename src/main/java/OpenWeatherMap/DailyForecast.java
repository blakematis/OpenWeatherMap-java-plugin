package OpenWeatherMap;


import JSON.JavaJsonObject;

import javax.json.JsonObject;

/**
 * Daily forecast must be used with the daily? request for OpenWeatherMap
 */
public class DailyForecast implements JavaJsonObject{

    private final long epochTime;
    private final City city;
    private final int pressure;
    private final int humidity;
    private final Weather weather;
    private final double speed;
    private final int deg;
    private final double rain;

    public DailyForecast(JsonObject jsonObject){
        this.epochTime = jsonObject.getJsonNumber("dt").longValue();
        this.city = new City(jsonObject.getJsonObject("city"));
        this.weather = new Weather(jsonObject.getJsonObject("weather"));
        this.pressure = jsonObject.getJsonNumber("pressure").intValue();
        this.humidity = jsonObject.getJsonNumber("humitidy").intValue();
        this.speed = jsonObject.getJsonNumber("speed").doubleValue();
        this.deg = jsonObject.getJsonNumber("deg").intValue();
        this.rain = jsonObject.getJsonNumber("rain").doubleValue();
    }

    @Override
    public JavaJsonObject build(JsonObject jsonObject) {
        return null;
    }

    @Override
    public JsonObject buildJson() {
        return null;
    }


}
