package OpenWeatherMap;

import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static junit.framework.TestCase.assertTrue;

public class WeatherTest {

    private Weather weather;

    @Before
    public void setupObject(){
        try {
            weather = OpenWeatherMapUtil.buildWeather("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22");
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testBuildForecast(){
        assertTrue(weather != null);
    }
}
