package OpenWeatherMap.JsonData;

import OpenWeatherMap.JsonData.AbstractOwmJsonObj;
import Util.DateInterpreter;

import javax.json.JsonObject;

import java.time.LocalDateTime;

public class Sys extends AbstractOwmJsonObj{

    public static final String JSON_COUNTRY = "country";
    public static final String JSON_SUNRISE = "sunrise";
    public static final String JSON_SUNSET = "sunset";

    private final String country;

    private final Long sunrise;

    private final Long sunset;

    public Sys(JsonObject jsonObject){
        super(jsonObject);
        this.country = this.getJsonObject().getJsonString(JSON_COUNTRY).getString();
        this.sunrise = this.getJsonObject().getJsonNumber(JSON_SUNRISE).longValue();
        this.sunset = this.getJsonObject().getJsonNumber(JSON_SUNSET).longValue();
    }

    public LocalDateTime getSunriseTime(){
        DateInterpreter dt = new DateInterpreter(getSunrise());
        return dt.getLocalDatetime();
    }

    public LocalDateTime getSunsetTime(){
        DateInterpreter dt = new DateInterpreter(getSunset());
        return dt.getLocalDatetime();
    }

    public String getCountry() {
        return country;
    }

    public Long getSunrise() {
        return sunrise;
    }

    public Long getSunset() {
        return sunset;
    }

}
