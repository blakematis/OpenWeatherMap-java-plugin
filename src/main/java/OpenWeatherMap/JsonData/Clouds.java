package OpenWeatherMap.JsonData;

import javax.json.JsonObject;

public class Clouds extends OwmJsonObj {

    public static String JSON_ALL = "all";

    private final int all;

    public Clouds(JsonObject jsonObject){
        super(jsonObject);
        this.all = this.getJsonObject().getJsonNumber(JSON_ALL).intValue();
    }

    public int getAll() {
        return all;
    }


    @Override
    public String toString(){
        return "- clouds: {" +
                "\n\t all: " + all +
                "\n}";
    }
}
