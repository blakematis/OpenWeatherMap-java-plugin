package OpenWeatherMap;

import JSON.JavaJsonObject;

import javax.json.*;

public class Wind implements JavaJsonObject {
    private double speed;
    private double deg;
    private int index;

    public Wind(){ }

    public Wind(double speed, double deg){
        this.speed = speed;
        this.deg = deg;
    }

    public void setSpeed(double speed){ this.speed = speed; }

    public double getSpeed() {
        return speed;
    }

    public void setDeg(double deg){ this.deg = deg; }

    public double getDeg(){
        return deg;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public JavaJsonObject build(JsonObject jsonObject) {
        JsonObject windJsonObj =  jsonObject.getJsonObject("wind");

        //Speed
        setSpeed(windJsonObj.getJsonNumber("speed").doubleValue());

        //Degree
        setDeg(windJsonObj.getJsonNumber("deg").doubleValue());



        return this;
    }

    @Override
    public JsonObject buildJson() {
        JsonObject jsonObject = Json.createObjectBuilder().add("speed", speed)
                .add("deg", deg).build();
        return jsonObject;
    }

    public JavaJsonObject build(JsonObject jsonObject, int index){
        setIndex(index);
        JsonArray list = jsonObject.getJsonArray("list");
        JsonObject main = list.getJsonObject(index);
        return build(main);
    }

    public String toString(){
        return buildJson().toString();
    }
}
