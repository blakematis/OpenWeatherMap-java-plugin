package OpenWeatherMap;


import OpenWeatherMap.JsonResponses.AbstractOwmResponse;

import java.net.MalformedURLException;

public class ThreeHourForecast extends AbstractOwmResponse {


    public ThreeHourForecast(String url) throws MalformedURLException {
        super(url);
    }
}
