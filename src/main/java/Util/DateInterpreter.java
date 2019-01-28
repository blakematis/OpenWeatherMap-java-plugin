package Util;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateInterpreter {

    private Long epochTime;

    private int day;

    private int month;

    private int year;

    private Date date;

    private Time localTime;

    private Calendar calendar = new GregorianCalendar();

    private static String[] days = new String[]{
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};

    public DateInterpreter(){

    }

    public DateInterpreter(Long epochTime) {
        this(new Date(epochTime * 1000));
    }

    public DateInterpreter(Date date){
        setEpochTime(date.getTime());
        calendar.setTime(date);
        calendar.setTimeZone(TimeZone.getDefault());
        setDay(calendar.get(Calendar.DAY_OF_WEEK)-1);
        setMonth(calendar.get(Calendar.MONTH));
        setYear(calendar.get(Calendar.YEAR));
        calendar.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println(getMonth());
        System.out.println(getYear());
    }

    public String getDayOfWeek(int day){
        return days[day];
    }

    public Long getEpochTime() {
        return epochTime;
    }

    public void setEpochTime(Long epochTime) {
        this.epochTime = epochTime;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
