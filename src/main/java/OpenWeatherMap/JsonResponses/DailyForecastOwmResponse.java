package OpenWeatherMap.JsonResponses;

import OpenWeatherMap.JsonData.City;
import OpenWeatherMap.JsonData.DailyForecast;

import javax.json.JsonArray;
import javax.json.JsonObject;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;


/**
 * DailyForecastOwmResponse creates a response in Java of daily forecast data
 * from 1-16 total days of DailyForecasts from OpenWeatherMap's JSON response.
 *
 * @Author: Blake Matis
 * @Company: EnerDapt Inc.
 * @Date_Created: 2/1/2019
 */
public class DailyForecastOwmResponse extends DailyOwmResponse {

    private static final String JSON_LIST = "list";

    private final City city;
    private final List<DailyForecast> dailyForecasts;
    
    public DailyForecastOwmResponse(String url) throws MalformedURLException {
        super(url);
        this.city = new City(getJsonRespnse().getJsonObject("city"));
        this.dailyForecasts = new ArrayList<>();
        JsonArray listObj = getJsonRespnse().getJsonArray(JSON_LIST);
        for(int index = 0; index < getCnt(); index++){
            try {
                JsonObject dailyForecast = listObj.getJsonObject(index);
                dailyForecasts.add(new DailyForecast(dailyForecast));
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public City getCity() {
        return city;
    }

    public List<DailyForecast> getDailyForecasts() {
        return dailyForecasts;
    }
}
