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
        try {
            weather = OpenWeatherMapUtil.buildWeather("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22");
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
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
