package OpenWeatherMap;

import JSON.JavaJsonObject;

import javax.json.JsonObject;

public class Clouds implements JavaJsonObject{
    private int all;

    public Clouds(){

    }

    public Clouds(int all){
        this.all = all;
    }

    @Override
    public JavaJsonObject build(JsonObject jsonObject) {
        return null;
    }

    @Override
    public JsonObject buildJson() {
        return null;
    }

    @Override
    public String toString(){
        return "";
    }
}
