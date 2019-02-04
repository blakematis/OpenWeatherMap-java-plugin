package OpenWeatherMap.JsonData;

import OpenWeatherMap.ConditionCodes;

import javax.json.JsonArray;

public class Weather extends OwmJsonArray {

    public static final String JSON_ID = "id";
    public static final String JSON_MAIN = "main";
    public static final String JSON_DESCRIPTION = "description";
    public static final String JSON_ICON_CODE = "icon";

    private final ConditionCodes conditionCodes;
    private final int id;
    private final String main;
    private final String description;
    private final String iconCode;

    public Weather(JsonArray jsonArray){
        super(jsonArray);
        this.id = this.getJsonArray().getJsonObject(0).getInt(JSON_ID);
        this.main = this.getJsonArray().getJsonObject(0).getJsonString(JSON_MAIN).getString();
        this.description = this.getJsonArray().getJsonObject(0).getJsonString(JSON_DESCRIPTION).getString();
        this.iconCode = this.getJsonArray().getJsonObject(0).getJsonString(JSON_ICON_CODE).getString();
        this.conditionCodes = ConditionCodes.codeFromId(this.id);
    }


    public ConditionCodes getConditionCodes() {
        return conditionCodes;
    }

    public int getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String getIconCode() {
        return iconCode;
    }

    public String toString(){
        return "- weather: [" +
                "\n\t\t - {" +
                "\n\t\t\t id: " + id + "," +
                "\n\t\t\t main: \"" + main + "\"," +
                "\n\t\t\t description: \"" + description + "\"," +
                "\n\t\t\t icon: \"" + iconCode + "\"" +
                "\n\t\t }" +
                "\n\t ]";
    }
}
