package OpenWeatherMap;

import OpenWeatherMap.JsonResponses.CurrentForecastOwmResponse;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.assertTrue;

public class CurrentForeCastOwmResponseTest {

    CurrentForecastOwmResponse response = null;

    @Before
    public void setupTest(){
        try {
            response = new CurrentForecastOwmResponse("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testResponse(){
        assertTrue(response != null);
    }
}
