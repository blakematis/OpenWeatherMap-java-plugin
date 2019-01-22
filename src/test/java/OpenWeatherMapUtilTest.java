import OpenWeatherMap.OpenWeatherMapUtil;
import OpenWeatherMap.WeatherForecast;

public class OpenWeatherMapUtilTest {

    public static void main(String[] args) throws  Exception{
        OpenWeatherMapUtil openWeatherMapUtil = new OpenWeatherMapUtil(95610);
        WeatherForecast forecast = openWeatherMapUtil.createForeCast();

        //forecast.toString();
    }
}
