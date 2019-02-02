package OpenWeatherMap.JsonResponses;

import OpenWeatherMap.JsonData.City;
import OpenWeatherMap.JsonData.DailyForecast;

import javax.json.JsonArray;
import javax.json.JsonObject;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class DailyForecastOwmResponse extends OwmResponse {

    private static final String JSON_LIST = "list";

    private final City city;
    private final List<DailyForecast> dailyForecasts;
    
    public DailyForecastOwmResponse(String url) throws MalformedURLException {
        super(url);
        this.city = new City(getJsonRespnse().getJsonObject("city"));
        this.dailyForecasts = new ArrayList<>();
        JsonArray listObj = getJsonRespnse().getJsonArray(JSON_LIST);
        for(int index = 0; index < getCnt(); index++){
            JsonObject dailyForecast = listObj.getJsonObject(index);
            dailyForecasts.add(new DailyForecast(dailyForecast));
        }
    }

    public City getCity() {
        return city;
    }

    public List<DailyForecast> getDailyForecasts() {
        return dailyForecasts;
    }
}
