package OpenWeatherMap;

import JSON.JSONReader;

import javax.json.*;
import java.net.MalformedURLException;

public class OpenWeatherMapUtil {

    public OpenWeatherMapUtil(){

    }

    public static JsonObject jsonReply(String API_URL) throws MalformedURLException {
        return JSONReader.getJsonReply(API_URL);
    }

}
