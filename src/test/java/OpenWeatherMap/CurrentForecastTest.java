package OpenWeatherMap;

import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CurrentForecastTest {

    private CurrentForecast currentForecast = null;

    @Before
    public void setupObject(){
        try {
            currentForecast = OpenWeatherMapUtil.buildCurrentForecast("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22");
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testBuildForecast(){
        assertTrue(currentForecast != null);
    }

    @Test
    public void testVisibility(){
        assertEquals("visibility", 12874, currentForecast.getVisibility());
    }

}
