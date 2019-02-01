package OpenWeatherMap;

import JSON.JavaJsonObject;

import javax.json.*;

public class City implements JavaJsonObject {
    private int id;
    private String name;
    private Coord coord;
    private String country;

    public City(){
    }

    public City(JsonObject jsonObject){
        this.id = id;
        this.name = name;
        this.coord = new Coord(lon, lat);
        this.country = country;
    }

    public City build(JsonObject jsonObject){
        JsonObject cityObj = jsonObject.getJsonObject("city");

        JsonNumber id = cityObj.getJsonNumber("id");
        setId(id.intValue());

        JsonString name = cityObj.getJsonString("name");
        setName(name.getString());

        JsonObject coord = cityObj.getJsonObject("coord");
        setCoord(coord.getJsonNumber("lon").doubleValue(), coord.getJsonNumber("lat").doubleValue());

        JsonString country = cityObj.getJsonString("country");
        setCountry(country.getString());
        return this;
    }

    @Override
    public JsonObject buildJson() {
        JsonObject jsonObject = Json.createObjectBuilder().build();
        jsonObject.put("id", Json.createValue(id));
        jsonObject.put("name", Json.createValue(name));
        jsonObject.put("coord", coord.buildJson());
        jsonObject.put("country", Json.createValue(country));
        return jsonObject;
    }

    public int getId(){ return id;}

    public String getName(){ return name;}

    public Coord getCoord(){ return coord;}

    public String getCountry(){ return country;}


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoord(double lon, double lat) {
        this.coord = new Coord(lon, lat);
    }

    public void setCountry(String country) {
        this.country = country;
    }



    @Override
    public String toString(){
        return "- city: { " +
                "\n\t id: " + id + "," +
                "\n\t name: " + name + "," +
                "\n\t - coord: " + coord.toString() + "," +
                "\n\t country: " + country +
                "\n }";
    }
}
