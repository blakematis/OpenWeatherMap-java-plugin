package OpenWeatherMap;

import JSON.JSONReader;

import javax.json.JsonObject;
import javax.json.JsonReader;

public class MainForecastTest {

    public static void main(String[] args) throws Exception{
        JsonObject jsonObject = OpenWeatherMapUtil.jsonReply("https://api.openweathermap.org/data/2.5/forecast?q=Roseville,US&units=imperial&appid=e513347207aae03c792f055e744790e4");

    }
}
