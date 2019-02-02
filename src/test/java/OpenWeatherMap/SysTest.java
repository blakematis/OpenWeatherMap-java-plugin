package OpenWeatherMap;

import OpenWeatherMap.JsonData.Sys;
import org.junit.Before;
import org.junit.Test;

import javax.json.JsonObject;
import java.net.MalformedURLException;

import static junit.framework.TestCase.assertEquals;

public class SysTest {

    private Sys sys;

    @Before
    public void setupObject(){
        try {
            JsonObject jsonObject = OpenWeatherMapUtil.jsonReply("https://samples.openweathermap.org/data/2.5/weather?zip=95610&appid=b6907d289e10d714a6e88b30761fae22");
            sys = (Sys) new Sys().build(jsonObject);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testBuildSys(){
        assertEquals("country: ", "US", sys.getCountry());
    }

}
