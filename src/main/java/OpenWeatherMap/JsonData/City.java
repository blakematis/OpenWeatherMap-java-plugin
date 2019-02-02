package OpenWeatherMap.JsonData;

import javax.json.*;

public class City extends AbstractOwmJsonObj{

    public static final String JSON_ID = "id";
    public static final String JSON_NAME = "name";
    public static final String JSON_COORD = "coord";
    public static final String JSON_COUNTRY = "country";
    public static final String JSON_POPULATION = "population";

    private final int id;
    private final String name;
    private final Coord coord;
    private final String country;
    private final int population;

    public City(JsonObject jsonObject){
        super(jsonObject);
        this.id = getJsonObject().getJsonNumber(JSON_ID).intValue();
        this.name = getJsonObject().getJsonString(JSON_NAME).getString();
        this.coord = new Coord(getJsonObject().getJsonObject(JSON_COORD));
        this.country = getJsonObject().getJsonString(JSON_COUNTRY).getString();
        this.population = getJsonObject().getJsonNumber(JSON_POPULATION).intValue();
    }



    public int getId(){ return id;}

    public String getName(){ return name;}

    public Coord getCoord(){ return coord;}

    public String getCountry(){ return country;}

    public int getPopulation(){ return population;}

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
