package OpenWeatherMap;

public class WeatherForecast {

    private City city;


    public WeatherForecast(){

    }


    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String toString(){
        String str = "- Forecast: " +
                "\n " + city.toString();
        return str;
    }
}
