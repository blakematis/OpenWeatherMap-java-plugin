package OpenWeatherMap;

import JSON.JavaJsonObject;


import javax.json.JsonObject;

public class CurrentForecast implements JavaJsonObject {

    private Coord coord;
    private Sys sys;
    private Long epochTime;
    private String name;
    private Weather weather;
    private Wind wind;
    private Main main;

    @Override
    public JavaJsonObject build(JsonObject jsonObject){
        return this;
    }

    @Override
    public JsonObject buildJson() {
        return null;
    }
}
