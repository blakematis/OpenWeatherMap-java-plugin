package OpenWeatherMap;

import org.junit.Test;

import javax.json.JsonObject;
import java.net.MalformedURLException;

import static org.junit.Assert.assertTrue;

public class CityTest {

    @Test
    public void testBuildCity(){
        try {
            JsonObject jsonObject = OpenWeatherMapUtil.jsonReply("https://samples.openweathermap.org/data/2.5/forecast?q=Roseville,us&appid=b6907d289e10d714a6e88b30761fae22");
            OpenWeatherMapUtil.buildCity(jsonObject);
            assertTrue(OpenWeatherMapUtil.buildCity(jsonObject) != null);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }

    }
}
