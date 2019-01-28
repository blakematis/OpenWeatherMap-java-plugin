package Util;

import java.util.Date;

public class DateInterpreterTest {

    public static void main(String[] args){
        Long dt = 1548676800L;
        DateInterpreter dateInterpreter = new DateInterpreter(dt);
        System.out.println(dateInterpreter.getDay());
        System.out.println(dateInterpreter.getDayOfWeek(dateInterpreter.getDay()));
    }
}
