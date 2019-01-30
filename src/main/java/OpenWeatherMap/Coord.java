package OpenWeatherMap;

import JSON.JavaJsonObject;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;

public class Coord implements JavaJsonObject {
    private double lon;
    private double lat;
    private JsonObject coord;

    public Coord(){

    }

    public Coord(double lon, double lat){
        this.lon = lon;
        this.lat = lat;
    }



    @Override
    public String toString(){
        return "{\n\t\t lon: " + lon + "," +
                "\n\t\t lat: " + lat +
                "\n\t }";
    }

    @Override
    public JavaJsonObject build(JsonObject jsonObject) {
        coord = jsonObject.getJsonObject("coord");
        lon = coord.getJsonNumber("lon").doubleValue();
        lat = coord.getJsonNumber("lat").doubleValue();
        return this;
    }

    @Override
    public JsonObject buildJson() {
        JsonArray jsonArray = Json.createArrayBuilder().build();
        jsonArray.add(0,Json.createObjectBuilder().build().put("lat",
                Json.createValue(lat)));
        jsonArray.add(0, Json.createObjectBuilder().build().put("lon",
                Json.createValue(lon)));
        return (JsonObject) jsonArray;
    }

    public double getLon() {
        return lon;
    }

    public double getLat() {
        return lat;
    }

    public JsonObject getCoord() {
        return coord;
    }
}
