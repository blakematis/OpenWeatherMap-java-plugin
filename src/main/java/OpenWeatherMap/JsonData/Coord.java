package OpenWeatherMap.JsonData;

import javax.json.JsonObject;

public class Coord extends OwmJsonObj {

    private static final String JSON_LON = "lon";
    private static final String JSON_LAT = "lat";

    private final double lon;
    private final double lat;

    public Coord(JsonObject jsonObject){
        super(jsonObject);
        lon = getJsonObject().getJsonNumber(JSON_LON).doubleValue();
        lat = getJsonObject().getJsonNumber(JSON_LAT).doubleValue();
    }

    @Override
    public String toString(){
        return "{\n\t\t lon: " + lon + "," +
                "\n\t\t lat: " + lat +
                "\n\t }";
    }


    public double getLon() {
        return lon;
    }

    public double getLat() {
        return lat;
    }
}
