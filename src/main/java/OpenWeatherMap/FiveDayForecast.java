package OpenWeatherMap;

import JSON.JavaJsonObject;

import javax.json.JsonArray;
import javax.json.JsonObject;
import java.util.ArrayList;

public class FiveDayForecast implements JavaJsonObject{

    private ArrayList<Forecast> forecasts;

    public FiveDayForecast(){

    }



    @Override
    public JavaJsonObject build(JsonObject jsonObject) {
        JsonArray list = jsonObject.getJsonArray("list");
        for(int i = 0; i < list.size(); i++){
            forecasts.add((Forecast) new Forecast().build(jsonObject, i));
        }
        return this;
    }

    @Override
    public JsonObject buildJson() {
        return null;
    }

    @Override
    public String toString(){
        return forecasts.toString();
    }
}
