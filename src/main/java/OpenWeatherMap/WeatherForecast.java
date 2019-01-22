package OpenWeatherMap;

public class WeatherForecast {

    private City city;

    private ConditionCodes weather;
    private String dateTime;

    public WeatherForecast(){

    }


    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public ConditionCodes getWeather() {
        return weather;
    }

    public void setWeather(ConditionCodes weather) {
        this.weather = weather;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String toString(){
        String str = "- Forecast: " +
                "\n " + city.toString();
        return str;
    }
}
