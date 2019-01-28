package Util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateInterpreterTest {

    @Test
    public void testGetDay(){
        Long dt = 1548676800L;
        DateInterpreter dateInterpreter = new DateInterpreter(dt);
        assertEquals("Day of week integer: ", 1, dateInterpreter.getDay());
    }

    @Test
    public void testGetDayOfWeek(){
        Long dt = 1548676800L;
        DateInterpreter dateInterpreter = new DateInterpreter(dt);
        assertEquals("Day of week string: ", "Monday", dateInterpreter.getDayOfWeek(dateInterpreter.getDay()));
    }

    @Test
    public void testGetMonthNumeric(){
        Long dt = 1548676800L;
        DateInterpreter dateInterpreter = new DateInterpreter(dt);
        assertEquals("Month integer value: ", 0, dateInterpreter.getMonth());
    }

    @Test
    public void testGetMonthOfYear(){
        Long dt = 1548676800L;
        DateInterpreter dateInterpreter = new DateInterpreter(dt);
        assertEquals("Month String Value ", "January", dateInterpreter.getMonthOfYear(dateInterpreter.getMonth()));
    }

    @Test
    public void testGetYearNumeric(){
        Long dt = 1548676800L;
        DateInterpreter dateInterpreter = new DateInterpreter(dt);
        assertEquals("Year integer value: ", 2019, dateInterpreter.getYear());
    }

    @Test
    public void testGetEpoch(){
        Long dt = 1548676800L;
        DateInterpreter dateInterpreter = new DateInterpreter(dt);
        Long actual = dateInterpreter.getEpochTime()/1000;
        assertEquals("Epoch value :", dt, actual);
    }

    @Test
    public void testHour(){
        Long dt = 1548676800L;
        DateInterpreter dateInterpreter = new DateInterpreter(dt);
        assertEquals("Hour test: ", 4, dateInterpreter.getHour());
    }

    @Test
    public void testMinutes(){
        Long dt = 1548676800L;
        DateInterpreter dateInterpreter = new DateInterpreter(dt);
        assertEquals("Minutes test: ", 0, dateInterpreter.getMinutes());
    }
}
