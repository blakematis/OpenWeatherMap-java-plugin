package OpenWeatherMap;

import JSON.JavaJsonObject;

import javax.json.JsonArray;
import javax.json.JsonObject;

public class Clouds implements JavaJsonObject{
    private int all;
    private int index;

    public Clouds(){

    }

    public Clouds(int all){
        this.all = all;
    }

    @Override
    public JavaJsonObject build(JsonObject jsonObject) {
        JsonObject cloudObj = jsonObject.getJsonObject("clouds");
        setAll(cloudObj.getJsonNumber("all").intValue());
        return this;
    }


    public JavaJsonObject build(JsonObject jsonObject, int index){
        setIndex(index);
        JsonArray list = jsonObject.getJsonArray("list");
        JsonObject main = list.getJsonObject(index);
        return build(main);
    }

    @Override
    public JsonObject buildJson() {
        //TODO
        return null;
    }

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString(){
        return "- clouds: {" +
                "\n\t all: " + all +
                "\n}";
    }
}
