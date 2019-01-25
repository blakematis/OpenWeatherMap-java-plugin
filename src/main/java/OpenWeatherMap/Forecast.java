package OpenWeatherMap;

import JSON.JavaJsonObject;

import javax.json.JsonArray;
import javax.json.JsonObject;

public class Forecast implements JavaJsonObject{

    private String date_txt;
    private double temp;
    private double tempMin;
    private double tempMax;
    private double pressure;
    private double seaLevel;
    private double groundLevel;
    private int humidity;
    private Wind wind;
    private ConditionCodes weather;
    private Clouds clouds;
    private int index;


    public Forecast(){

    }

    @Override
    public JavaJsonObject build(JsonObject jsonObject) {
        JsonObject mainObj = jsonObject.getJsonObject("main");
        setTemp(mainObj.getJsonNumber("temp").doubleValue());
        setTempMin(mainObj.getJsonNumber("temp_min").doubleValue());
        setTempMax(mainObj.getJsonNumber("temp_max").doubleValue());
        setPressure(mainObj.getJsonNumber("pressure").doubleValue());
        setSeaLevel(mainObj.getJsonNumber("sea_level").doubleValue());
        setGroundLevel(mainObj.getJsonNumber("grnd_level").doubleValue());
        setHumidity(mainObj.getJsonNumber("humidity").intValue());
        setDate_txt(jsonObject.getJsonString("dt_txt").getString());
        return this;
    }

    public JavaJsonObject build(JsonObject jsonObject, int index){
        setIndex(index);
        JsonArray list = jsonObject.getJsonArray("list");
        JsonObject main = list.getJsonObject(index);
        setWind((Wind) new Wind().build(jsonObject));
        setClouds((Clouds) new Clouds().build(jsonObject,index));
        return build(main);
    }

    @Override
    public JsonObject buildJson() {
        return null;
    }

    public String getDate_txt() {
        return date_txt;
    }

    public void setDate_txt(String date_txt) {
        this.date_txt = date_txt;
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

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(double seaLevel) {
        this.seaLevel = seaLevel;
    }

    public double getGroundLevel() {
        return groundLevel;
    }

    public void setGroundLevel(double groundLevel) {
        this.groundLevel = groundLevel;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setWind(Wind wind){
        this.wind = wind;
    }

    public Wind getWind(){
        return wind;
    }

    public ConditionCodes getWeather() {
        return weather;
    }

    public void setWeather(ConditionCodes weather) {
        this.weather = weather;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString(){
        String str = "- Forecast: {" +
                "\n\t temp: " + temp + "," +
                "\n\t temp_min: " + tempMin + "," +
                "\n\t temp_max: " + tempMax + "," +
                "\n\t pressure: " + pressure + "," +
                "\n\t sea_level: " + seaLevel + "," +
                "\n\t grnd_level: " + groundLevel + "," +
                "\n\t humidty: " + humidity + "," +
                "\n\t dt_txt: " + date_txt + "," +
                "\n\t " + wind;
        return str;
    }


}
