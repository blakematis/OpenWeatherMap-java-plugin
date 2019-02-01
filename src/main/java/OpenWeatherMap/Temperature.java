package OpenWeatherMap;

import JSON.JavaJsonObject;

import javax.json.JsonArray;
import javax.json.JsonObject;


/**
 * Temperature specifically gets used when using the daily? query.
 */
public class Temperature implements JavaJsonObject {
    private double day;
    private double min;
    private double max;
    private double night;
    private double eve;
    private double morn;
    private JsonObject temperature;


    public Temperature() { }

    @Override
    public JavaJsonObject build(JsonObject jsonObject) {
        temperature = jsonObject.getJsonObject("temp");
        day = temperature.getJsonNumber("day").doubleValue();
        min = temperature.getJsonNumber("min").doubleValue();
        max = temperature.getJsonNumber("max").doubleValue();
        night = temperature.getJsonNumber("night").doubleValue();
        eve = temperature.getJsonNumber("eve").doubleValue();
        morn = temperature.getJsonNumber("morn").doubleValue();
        return this;
    }

    public JavaJsonObject build(JsonObject jsonObject, int index){
        JsonArray jsonArray = jsonObject.getJsonArray("list");
        JsonObject dailyForecast = jsonArray.get(index).asJsonObject();
        return build(dailyForecast);
    }

    @Override
    public JsonObject buildJson() {
        return null;
    }

    public double getDay() {
        return day;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getNight() {
        return night;
    }

    public double getEve() {
        return eve;
    }

    public double getMorn() {
        return morn;
    }

    public JsonObject getTemperature() {
        return temperature;
    }
}
