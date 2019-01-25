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


    public JavaJsonObject build(JsonObject jsonObject, int index){
        return build(jsonObject);
    }

    @Override
    public JsonObject buildJson() {
        return null;
    }

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    @Override
    public String toString(){
        return "- clouds: {" +
                "\n\t all: " + all +
                "\n}";
    }
}
