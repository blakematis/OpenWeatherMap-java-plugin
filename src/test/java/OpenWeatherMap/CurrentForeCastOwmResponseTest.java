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

    @Test
    public void testCoord(){
        assertTrue("Coord is not null", response.getCoord() != null);
        assertTrue("Longitude test",-122.09 == response.getCoord().getLon());
        assertTrue("Latitude test", 37.39 == response.getCoord().getLat());
    }

    @Test
    public void testWeather(){
        assertTrue("Weather is not null", response.getWeather() != null);
        assertTrue("Id test", response.getWeather().getId() == 500);
        assertTrue("Main test", response.getWeather().getMain().toLowerCase()
                .equalsIgnoreCase("rain"));
        assertTrue("Description test", response.getWeather().getDescription()
                .toLowerCase().equalsIgnoreCase("light rain"));
        assertTrue("Icon test", response.getWeather().getIconCode().toLowerCase()
                .equalsIgnoreCase("10d"));
    }

    @Test
    public void testBase(){
        assertTrue("Base", response.getBase().toLowerCase().equalsIgnoreCase("stations"));
    }

    @Test
    public void testMain(){
        assertTrue("Main is not null", response.getMain() != null);
        assertTrue("Temperature", response.getMain().getTemp() == 280.44);
        assertTrue("Pressure", response.getMain().getPressure() == 1017);
        assertTrue("Humidity", response.getMain().getHumidity() == 61);
        assertTrue("TempMin", response.getMain().getTempMin() == 279.15);
        assertTrue("TempMax", response.getMain().getTempMax() == 281.15);
    }

    @Test
    public void testVisibility(){
        assertTrue("Visibility", response.getVisibility() == 12874);
    }

    @Test
    public void testWind(){
        assertTrue("Wind", response.getWeather() != null);
        assertTrue("speed", response.getWind().getSpeed() == 8.2);
        assertTrue("degree", response.getWind().getDeg() == 340);
    }

    @Test
    public void testClouds(){
        assertTrue("Clouds", response.getClouds() != null);
        assertTrue("Percent Clouds", response.getClouds().getAll() == 1);
    }

    @Test
    public void testDateTime(){
        assertTrue("DateTime", response.getEpochTime() == 1519061700);
    }

    @Test
    public void testSys(){
        assertTrue("Sys is not null", response.getSys() != null);
        assertTrue("country", response.getSys().getCountry().toLowerCase()
                .equalsIgnoreCase("US"));
        assertTrue("sunrise", response.getSys().getSunrise() == 1519051894);
        assertTrue("sunset", response.getSys().getSunset() == 1519091585);
    }

    @Test
    public void testId(){
        assertTrue("Id", response.getId() == 0);
    }

    @Test
    public void testName(){
        assertTrue("name", response.getName().toLowerCase()
                .equalsIgnoreCase("Mountain View"));
    }

    @Test
    public void testCod(){
        assertTrue("cod", response.getCod() == 200);
    }




}
