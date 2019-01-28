package OpenWeatherMap;

import org.junit.Test;

import javax.json.JsonObject;
import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CityTest {

    @Test
    public void testBuildCity(){
        try {
            JsonObject jsonObject = OpenWeatherMapUtil.jsonReply("https://api.openweathermap.org/data/2.5/forecast?q=Roseville,US&units=imperial&appid=e513347207aae03c792f055e744790e4");
            OpenWeatherMapUtil.buildCity(jsonObject);
            assertTrue(OpenWeatherMapUtil.buildCity(jsonObject) != null);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }

    }
}
