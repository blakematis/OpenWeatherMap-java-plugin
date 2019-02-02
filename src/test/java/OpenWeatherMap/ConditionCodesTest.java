package OpenWeatherMap;

import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ConditionCodesTest {

    private ConditionCodes conditionCode;

    @Before
    public void setupObject(){
    }

    @Test
    public void testConditionCode(){
        assertTrue(conditionCode != null);
    }

    @Test
    public void testConditionCodeId(){
        assertEquals("code id", 500, conditionCode.getId());
    }
}
