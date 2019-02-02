package OpenWeatherMap;

import JSON.JavaJsonObject;
import OpenWeatherMap.JsonData.AbstractOwmJsonObj;

import javax.json.JsonObject;

public class Main extends AbstractOwmJsonObj{

    public static final String JSON_TEMP = "temp";
    public static final String JSON_TEMP_MIN = "temp_min";
    public static final String JSON_TEMP_MAX = "temp_max";
    public static final String JSON_HUMIDITY = "humidity";
    public static final String JSON_PRESSURE = "pressure";


    private final double temp;
    private final double tempMin;
    private final double tempMax;
    private final int humidity;
    private final int pressure;

    public Main(JsonObject jsonObject){
        super(jsonObject);
        this.temp = this.getJsonObject().getJsonNumber(JSON_TEMP).doubleValue();
        this.tempMin = this.getJsonObject().getJsonNumber(JSON_TEMP_MIN).doubleValue();
        this.tempMax = this.getJsonObject().getJsonNumber(JSON_TEMP_MAX).doubleValue();
        this.humidity = this.getJsonObject().getJsonNumber(JSON_HUMIDITY).intValue();
        this.pressure = this.getJsonObject().getJsonNumber(JSON_PRESSURE).intValue();
    }

    public double getTemp() {
        return temp;
    }

    public double getTempMin() {
        return tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

}
