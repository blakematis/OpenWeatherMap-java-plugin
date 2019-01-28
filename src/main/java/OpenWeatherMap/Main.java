package OpenWeatherMap;

import JSON.JavaJsonObject;

import javax.json.JsonObject;

public class Main implements JavaJsonObject {

    private double temp;
    private double tempMin;
    private double tempMax;
    private int humidity;
    private int pressure;
    private JsonObject main;

    public Main(){

    }

    public Main(JsonObject main){
        this.main = main;
    }

    public Main(double temp, double tempMin,
                double tempMax, int humidity, int pressure){

        this.temp = temp;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.humidity = humidity;
        this.pressure = pressure;

    }

    @Override
    public JavaJsonObject build(JsonObject jsonObject) {
        main = jsonObject.getJsonObject("main");
        setTemp(main.getJsonNumber("temp").doubleValue());
        setHumidity(main.getJsonNumber("humidity").intValue());
        setPressure(main.getJsonNumber("pressure").intValue());
        setTempMin(main.getJsonNumber("temp_min").doubleValue());
        setTempMax(main.getJsonNumber("temp_max").doubleValue());

        return this;
    }

    @Override
    public JsonObject buildJson() {
        return null;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString(){
        return main.toString();
    }
}
