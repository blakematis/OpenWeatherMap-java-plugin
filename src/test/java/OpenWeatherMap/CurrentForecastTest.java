package OpenWeatherMap;

import org.junit.Before;
import org.junit.Test;

import javax.json.JsonObject;
import java.net.MalformedURLException;

import static junit.framework.TestCase.assertTrue;

public class CurrentForecastTest {

    private CurrentForecast currentForecast;

    @Before
    public void setupObject(){
        try {
            JsonObject jsonObject = OpenWeatherMapUtil.jsonReply("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22");
            currentForecast = (CurrentForecast) currentForecast.build(jsonObject);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testBuildForecast(){
        assertTrue(currentForecast != null);
    }

}
