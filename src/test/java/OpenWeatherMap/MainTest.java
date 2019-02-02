package OpenWeatherMap;

import OpenWeatherMap.JsonData.Main;
import org.junit.Before;
import org.junit.Test;

import javax.json.JsonObject;
import java.net.MalformedURLException;

import static junit.framework.TestCase.assertTrue;

public class MainTest {

    private Main main;

    @Before
    public void setupObject(){

    }

    @Test
    public void testBuildMain(){
        assertTrue(main != null);
    }
}
