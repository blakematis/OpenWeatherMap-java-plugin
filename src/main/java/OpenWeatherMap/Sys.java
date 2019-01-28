package OpenWeatherMap;

import JSON.JavaJsonObject;

import javax.json.JsonObject;

public class Sys implements JavaJsonObject{

    private String country;

    private Long sunrise;

    private Long sunset;

    private JsonObject sys;

    public Sys(){

    }

    @Override
    public JavaJsonObject build(JsonObject jsonObject) {
        sys = jsonObject.getJsonObject("sys");
        setCountry(sys.getJsonString("country").getString());
        setSunrise(sys.getJsonNumber("sunrise").longValue());
        setSunset(sys.getJsonNumber("sunset").longValue());
        return this;
    }

    @Override
    public JsonObject buildJson() {
        return sys;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getSunrise() {
        return sunrise;
    }

    public void setSunrise(Long sunrise) {
        this.sunrise = sunrise;
    }

    public Long getSunset() {
        return sunset;
    }

    public void setSunset(Long sunset) {
        this.sunset = sunset;
    }

    @Override
    public String toString(){
        return sys.toString();
    }
}
