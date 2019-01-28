package OpenWeatherMap;

import JSON.JavaJsonObject;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;

public class Coord implements JavaJsonObject {
    private double lon;
    private double lat;

    public Coord(double lon, double lat){
        this.lon = lon;
        this.lat = lat;
    }



    @Override
    public String toString(){
        String str = "{\n\t\t lon: " + lon + "," +
                "\n\t\t lat: " + lat +
                "\n\t }";
        return str;
    }

    @Override
    public JavaJsonObject build(JsonObject jsonObject) {
        //TODO
        return this;
    }

    @Override
    public JsonObject buildJson() {
        JsonArray jsonArray = (JsonArray) Json.createArrayBuilder().build();
        jsonArray.add(0,Json.createObjectBuilder().build().put("lat",
                Json.createValue(lat)));
        jsonArray.add(0, Json.createObjectBuilder().build().put("lon",
                Json.createValue(lon)));
        return (JsonObject) jsonArray;
    }
}
