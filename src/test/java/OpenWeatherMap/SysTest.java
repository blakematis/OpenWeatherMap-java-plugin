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
    }

    @Test
    public void testBuildSys(){
        assertEquals("country: ", "US", sys.getCountry());
    }

}
