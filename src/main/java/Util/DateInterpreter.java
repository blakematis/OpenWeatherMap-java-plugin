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

    private Calendar calendar = new GregorianCalendar();

    private static String[] days = new String[]{
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};

    private static String[] months = new String[]{
            "January", "February", "March", "April", "May",
            "June", "July", "August", "September", "October",
            "November", "December"};

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

    }

    public int getHour(){ return calendar.get(Calendar.HOUR);}

    public int getMinutes(){ return calendar.get(Calendar.MINUTE);}

    public String getMonthOfYear(int month){ return months[month];}

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
