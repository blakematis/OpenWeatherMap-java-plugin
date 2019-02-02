package OpenWeatherMap.JsonResponses;

import OpenWeatherMap.JsonData.*;


import java.net.MalformedURLException;

public class CurrentForecastOwmResponse extends OwmResponse {

    private static final String JSON_COORD = "coord";
    private static final String JSON_WEATHER = "weather";
    private static final String JSON_BASE = "base";
    private static final String JSON_MAIN = "main";
    private static final String JSON_VISIBILITY = "visibility";
    private static final String JSON_WIND = "wind";
    private static final String JSON_CLOUDS = "clouds";
    private static final String JSON_DT = "dt";
    private static final String JSON_SYS = "sys";
    private static final String JSON_ID = "id";
    private static final String JSON_NAME = "name";

    private final Coord coord;
    private final Weather weather;
    private final String base;
    private final Main main;
    private final int visibility;
    private final Wind wind;
    private final Clouds clouds;
    private final Long epochTime;
    private final Sys sys;
    private final int id;
    private final String name;

    public CurrentForecastOwmResponse(String url) throws MalformedURLException {
        super(url);
        this.coord = new Coord(this.getJsonRespnse().getJsonObject(JSON_COORD));
        this.weather = new Weather(this.getJsonRespnse().getJsonArray(JSON_WEATHER));
        this.base = this.getJsonRespnse().getJsonString(JSON_BASE).getString();
        this.main = new Main(this.getJsonRespnse().getJsonObject(JSON_MAIN));
        this.visibility = this.getJsonRespnse().getJsonNumber(JSON_VISIBILITY).intValue();
        this.wind = new Wind(this.getJsonRespnse().getJsonObject(JSON_WIND));
        this.clouds = new Clouds(this.getJsonRespnse().getJsonObject(JSON_CLOUDS));
        this.epochTime = this.getJsonRespnse().getJsonNumber(JSON_DT).longValue();
        this.sys = new Sys(this.getJsonRespnse().getJsonObject(JSON_SYS));
        this.id = this.getJsonRespnse().getJsonNumber(JSON_ID).intValue();
        this.name = this.getJsonRespnse().getJsonString(JSON_NAME).getString();
    }

    public Coord getCoord() {
        return coord;
    }

    public Weather getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public Main getMain() {
        return main;
    }

    public int getVisibility() {
        return visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Long getEpochTime() {
        return epochTime;
    }

    public Sys getSys() {
        return sys;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
