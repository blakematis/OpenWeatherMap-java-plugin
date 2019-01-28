package OpenWeatherMap;

import JSON.JavaJsonObject;

import javax.json.JsonArray;
import javax.json.JsonObject;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Forecast implements JavaJsonObject{

    private String date_txt;
    private Long epochTime;
    private double temp;
    private double tempMin;
    private double tempMax;
    private double pressure;
    private double seaLevel;
    private double groundLevel;
    private int humidity;
    private Wind wind;
    private Weather weather;
    private Clouds clouds;
    private int index;
    private Date date;
    private Time time;


    public Forecast(){

    }

    @Override
    public JavaJsonObject build(JsonObject jsonObject) {
        JsonObject mainObj = jsonObject.getJsonObject("main");
        setEpochTime((long) jsonObject.getInt("dt"));
        setTemp(mainObj.getJsonNumber("temp").doubleValue());
        setTempMin(mainObj.getJsonNumber("temp_min").doubleValue());
        setTempMax(mainObj.getJsonNumber("temp_max").doubleValue());
        setPressure(mainObj.getJsonNumber("pressure").doubleValue());
        setSeaLevel(mainObj.getJsonNumber("sea_level").doubleValue());
        setGroundLevel(mainObj.getJsonNumber("grnd_level").doubleValue());
        setHumidity(mainObj.getJsonNumber("humidity").intValue());
        setDate_txt(jsonObject.getJsonString("dt_txt").getString());
        buildDate(epochTime);
        return this;
    }

    public JavaJsonObject build(JsonObject jsonObject, int index){
        setIndex(index);
        JsonArray list = jsonObject.getJsonArray("list");
        JsonObject main = list.getJsonObject(index);
        setWind((Wind) new Wind().build(jsonObject, index));
        setClouds((Clouds) new Clouds().build(jsonObject,index));
        setWeather((Weather) new Weather().build(jsonObject, index));
        return build(main);
    }

    private void buildDate(Long epochTime){
        Calendar calendar = new GregorianCalendar();
        Date date = new Date(epochTime*1000);
        calendar.setTime(date);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println(format.format(date));
        setDate(date);
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

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getEpochTime() {
        return epochTime;
    }

    public void setEpochTime(Long epochTime) {
        this.epochTime = epochTime;
    }

    @Override
    public String toString(){
        String str = "- Forecast: {" +
                "\n\t dt: " + epochTime + "," +
                "\n\t temp: " + temp + "," +
                "\n\t temp_min: " + tempMin + "," +
                "\n\t temp_max: " + tempMax + "," +
                "\n\t pressure: " + pressure + "," +
                "\n\t sea_level: " + seaLevel + "," +
                "\n\t grnd_level: " + groundLevel + "," +
                "\n\t humidty: " + humidity + "," +
                "\n\t dt_txt: " + date_txt + "," +
                "\n\t " + weather + "," +
                "\n\t " + wind;
        return str;
    }


}
