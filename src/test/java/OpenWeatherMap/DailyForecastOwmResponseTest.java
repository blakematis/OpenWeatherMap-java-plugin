package OpenWeatherMap;

import OpenWeatherMap.JsonResponses.DailyForecastOwmResponse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DailyForecastOwmResponseTest {

    DailyForecastOwmResponse dailyForecast = null;

    @Before
    public void setupTest() {
        try {
            dailyForecast = new DailyForecastOwmResponse("https://samples.openweathermap.org/data/2.5/forecast/daily?zip=94040&appid=b6907d289e10d714a6e88b30761fae22");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testResponse(){
        assertTrue(dailyForecast != null);
    }
}
