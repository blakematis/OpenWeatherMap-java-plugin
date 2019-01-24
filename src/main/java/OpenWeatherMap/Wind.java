package OpenWeatherMap;

import JSON.JavaJsonObject;

import javax.json.*;

public class Wind implements JavaJsonObject {
    private double speed;
    private double deg;

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

    @Override
    public JavaJsonObject build(JsonObject jsonObject) {
        JsonArray listJsonObj = jsonObject.getJsonArray("list");
        JsonObject forecast = listJsonObj.getJsonObject(0);
        JsonObject windJsonObj = forecast.getJsonObject("wind");

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

    public String toString(){
        return buildJson().toString();
    }
}
