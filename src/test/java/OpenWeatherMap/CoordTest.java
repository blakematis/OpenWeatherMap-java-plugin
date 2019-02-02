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
        try {
            coord = OpenWeatherMapUtil.buildCoord("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22");
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
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
