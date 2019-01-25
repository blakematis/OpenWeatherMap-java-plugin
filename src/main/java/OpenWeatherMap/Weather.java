package OpenWeatherMap;

import JSON.JavaJsonObject;

import javax.json.JsonObject;

public class Weather implements JavaJsonObject {

    private ConditionCodes conditionCodes;
    private int id;
    private String main;
    private String description;
    private String iconCode;

    public Weather(){ }

    public Weather(ConditionCodes conditionCodes){
        this.conditionCodes = conditionCodes;
    }

    @Override
    public JavaJsonObject build(JsonObject jsonObject) {
        return null;
    }

    @Override
    public JsonObject buildJson() {
        return null;
    }

    public String toString(){
        return "- weather: [" +
                "\n\t- {" +
                "\n\t\tid: " + id + "," +
                "\n\t\tmain: \"" + main + "\"," +
                "\n\t\tdescription: \"" + description + "\"," +
                "\n\t\ticon: \"" + iconCode + "\"" +
                "\n\t}" +
                "\n]";
    }
}
