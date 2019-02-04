package OpenWeatherMap;

import OpenWeatherMap.JsonData.CurrentForecast;
import OpenWeatherMap.JsonResponses.CurrentForecastOwmResponse;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CurrentForecastTest {

    private CurrentForecast currentForecast = null;

    @Before
    public void setupObject(){

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
