package OpenWeatherMap;

import OpenWeatherMap.JsonData.Weather;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class WeatherTest {

    private Weather weather;

    @Before
    public void setupObject(){
    }

    @Test
    public void testWeather(){
        assertTrue(weather != null);
    }

    @Test
    public void testGetId(){
        assertEquals("Id", 500, weather.getId());
    }

    @Test
    public void testGetConditionCode(){
        assertEquals("ConditionCode", ConditionCodes.LIGHT_RAIN , weather.getConditionCodes());
    }

    @Test
    public void testConditionCodesFromId(){
        assertEquals("FromId", ConditionCodes.LIGHT_RAIN, ConditionCodes.codeFromId(weather.getId()));
    }

    @Test
    public void testDescription(){
        assertEquals("Description", ConditionCodes.LIGHT_RAIN.getDescription(), weather.getConditionCodes().getDescription());
    }

    @Test
    public void testMain(){
        assertEquals("Main", ConditionCodes.LIGHT_RAIN.getMain(), weather.getConditionCodes().getMain());
    }
}
