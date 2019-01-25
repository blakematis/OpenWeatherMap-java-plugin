package OpenWeatherMap;

public class FiveDayForecast {

    private City city;


    public FiveDayForecast(){

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
