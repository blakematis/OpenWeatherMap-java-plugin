package OpenWeatherMap.JsonData;


import JSON.JavaJsonObject;

import javax.json.JsonObject;

/**
 * Daily forecast must be used with the daily? request for OpenWeatherMap
 */
public class DailyForecast extends AbstractOwmJsonObj implements JavaJsonObject{

    public static final String JSON_DT = "dt";
    public static final String JSON_TEMP = "temp";
    public static final String JSON_WEATHER = "weather";
    public static final String JSON_PRESSURE = "pressure";
    public static final String JSON_HUMIDITY = "humidity";
    public static final String JSON_SPEED = "speed";
    public static final String JSON_DEG = "deg";
    public static final String JSON_RAIN = "rain";

    private final long epochTime;
    private final int pressure;
    private final int humidity;
    private final Weather weather;
    private final Temperature temperature;
    private final double speed;
    private final int deg;
    private final double rain;

    public DailyForecast(JsonObject jsonObject){
        super(jsonObject);
        this.epochTime = this.getJsonObject().getJsonNumber(JSON_DT).longValue();
        this.temperature = new Temperature(this.getJsonObject().getJsonObject(JSON_TEMP));
        this.weather = new Weather(this.getJsonObject().getJsonArray(JSON_WEATHER));
        this.pressure = this.getJsonObject().getJsonNumber(JSON_PRESSURE).intValue();
        this.humidity = this.getJsonObject().getJsonNumber(JSON_HUMIDITY).intValue();
        this.speed = this.getJsonObject().getJsonNumber(JSON_SPEED).doubleValue();
        this.deg = jsonObject.getJsonNumber(JSON_DEG).intValue();
        this.rain = jsonObject.getJsonNumber(JSON_RAIN).doubleValue();
    }

    @Override
    public JavaJsonObject build(JsonObject jsonObject) {
        return null;
    }

    @Override
    public JsonObject buildJson() {
        return null;
    }

    public long getEpochTime() {
        return epochTime;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public Weather getWeather() {
        return weather;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public double getSpeed() {
        return speed;
    }

    public int getDeg() {
        return deg;
    }

    public double getRain() {
        return rain;
    }
}
