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

    public City(int id, String name, double lon, double lat, String country){
        this.id = id;
        this.name = name;
        this.coord = new Coord(lon, lat);
        this.country = country;
    }

    public City build(JsonReader reader){
        City city = new City();
        try{
            JsonObject cityObj = reader.read().asJsonObject().getJsonObject("city");

            JsonNumber id = cityObj.getJsonNumber("id");
            city.setId(id.intValue());

            JsonString name = cityObj.getJsonString("name");
            city.setName(name.getString());

            JsonObject coord = cityObj.getJsonObject("coord");
            city.setCoord(coord.getJsonNumber("lon").doubleValue(), coord.getJsonNumber("lat").doubleValue());

            JsonString country = cityObj.getJsonString("country");
            city.setCountry(country.getString());

        }catch (Exception e){
            e.printStackTrace();
        }
        return city;
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


    private class Coord implements JavaJsonObject{
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
        public JavaJsonObject build(JsonReader jsonReader) {
            return null;
        }

        @Override
        public JsonObject buildJson() {
            JsonArray jsonArray = (JsonArray)Json.createArrayBuilder().build();
            jsonArray.add(0,Json.createObjectBuilder().build().put("lat",
                            Json.createValue(coord.lat)));
            jsonArray.add(0, Json.createObjectBuilder().build().put("lon",
                    Json.createValue(coord.lon)));
            return (JsonObject) jsonArray;
        }
    }
    @Override
    public String toString(){
        String str = "- city: { " +
                "\n\t id: " + id + "," +
                "\n\t name: " + name + "," +
                "\n\t - coord: " + coord.toString() + "," +
                "\n\t country: " + country +
                "\n }";
        return str;
    }
}
