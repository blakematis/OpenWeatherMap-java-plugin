package OpenWeatherMap.JsonData;

import OpenWeatherMap.JsonData.AbstractOwmJsonObj;
import OpenWeatherMap.JsonData.Coord;
import OpenWeatherMap.JsonData.Sys;
import OpenWeatherMap.JsonData.Weather;
import OpenWeatherMap.Main;
import OpenWeatherMap.Wind;
import Util.DateInterpreter;


import javax.json.JsonObject;
import java.time.LocalDateTime;

public class CurrentForecast extends AbstractOwmJsonObj {

    private static final String JSON_COORD = "coord";
    private static final String JSON_SYS = "sys";
    private static final String JSON_DT = "dt";
    private static final String JSON_NAME = "name";
    private static final String JSON_WEATHER = "weather";
    private static final String JSON_WIND = "wind";
    private static final String JSON_MAIN = "main";
    private static final String JSON_VISIBILITY = "visibility";

    private final Coord coord;
    private final Sys sys;
    private final Long epochTime;
    private final String name;
    private final Weather weather;
    private final Wind wind;
    private final Main main;
    private final int visibility;

    public CurrentForecast(JsonObject jsonObject){
        super(jsonObject);
        this.coord = new Coord(this.getJsonObject().getJsonObject(JSON_COORD));
        this.sys = new Sys(this.getJsonObject().getJsonObject(JSON_SYS));
        this.epochTime =  this.getJsonObject().getJsonNumber(JSON_DT).longValue();
        this.name = this.getJsonObject().getJsonString(JSON_NAME).getString();
        this.weather = new Weather(this.getJsonObject().getJsonArray(JSON_WEATHER));
        this.wind = new Wind(this.getJsonObject().getJsonObject(JSON_WIND));
        this.main = new Main(this.getJsonObject().getJsonObject(JSON_MAIN));
        this.visibility = this.getJsonObject().getJsonNumber(JSON_VISIBILITY).intValue();
    }

    public LocalDateTime getLastUpdatetime() {
        DateInterpreter dt = new DateInterpreter(this.getEpochTime());
        return dt.getLocalDatetime();
    }

    public Coord getCoord() {
        return coord;
    }

    public Sys getSys() {
        return sys;
    }

    public Long getEpochTime() {
        return epochTime;
    }

    public String getName() {
        return name;
    }

    public Weather getWeather() {
        return weather;
    }

    public Wind getWind() {
        return wind;
    }

    public Main getMain() {
        return main;
    }

    public int getVisibility() {
        return visibility;
    }

}
