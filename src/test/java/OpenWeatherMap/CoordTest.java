package OpenWeatherMap;

import OpenWeatherMap.JsonData.Coord;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CoordTest {

    private Coord coord;

    @Before
    public void setupObject(){
    }

    @Test
    public void testBuildForecast(){
        assertTrue(coord != null);
    }

    @Test
    public void testLat(){
        assertEquals("Latitude", 37.39 , coord.getLat());
    }

    @Test
    public void testLon(){
        assertEquals("Longitude", -122.09,coord.getLon());
    }
}
