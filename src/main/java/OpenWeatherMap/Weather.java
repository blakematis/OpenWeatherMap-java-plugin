package OpenWeatherMap;

import JSON.JavaJsonObject;

import javax.json.JsonArray;
import javax.json.JsonObject;

public class Weather implements JavaJsonObject {

    private ConditionCodes conditionCodes;
    private int id;
    private String main;
    private String description;
    private String iconCode;
    private int index;

    public Weather(){ }

    public Weather(ConditionCodes conditionCodes){
        this.conditionCodes = conditionCodes;
    }

    @Override
    public JavaJsonObject build(JsonObject jsonObject) {
        JsonArray weatherObj = jsonObject.getJsonArray("weather");
        setId(weatherObj.getJsonObject(0).getJsonNumber("id").intValue());
        setConditionCodes(ConditionCodes.codeFromId(getId()));
        setDescription(conditionCodes.description());
        setMain(conditionCodes.main());
        return this;
    }

    @Override
    public JsonObject buildJson() {
        //TODO
        return null;
    }

    public JavaJsonObject build(JsonObject jsonObject, int index){
        setIndex(index);
        JsonArray list = jsonObject.getJsonArray("list");
        JsonObject main = list.getJsonObject(index);
        return build(main);
    }

    public ConditionCodes getConditionCodes() {
        return conditionCodes;
    }

    public void setConditionCodes(ConditionCodes conditionCodes) {
        this.conditionCodes = conditionCodes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIconCode() {
        return iconCode;
    }

    public void setIconCode(String iconCode) {
        this.iconCode = iconCode;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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
