package OpenWeatherMap;

import javax.json.JsonObject;

public class WeatherTest {
    public static void main(String[] args) throws Exception{
        JsonObject jsonObject = OpenWeatherMapUtil.jsonReply("https://api.openweathermap.org/data/2.5/forecast?q=Roseville,US&units=imperial&appid=e513347207aae03c792f055e744790e4");
        System.out.println(OpenWeatherMapUtil.buildForecast(jsonObject, 0));
    }
}
