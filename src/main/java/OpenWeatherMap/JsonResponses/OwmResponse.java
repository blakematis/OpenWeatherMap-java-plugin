package OpenWeatherMap.JsonResponses;

import OpenWeatherMap.OpenWeatherMapUtil;

import javax.json.JsonObject;
import java.net.MalformedURLException;

public class OwmResponse {

    private final String url;
    private final JsonObject jsonRespnse;

    public OwmResponse(String url) throws MalformedURLException {
        this.url = url;
        this.jsonRespnse = OpenWeatherMapUtil.jsonReply(url);
    }

    public String getUrl() {
        return url;
    }

    public JsonObject getJsonRespnse() {
        return jsonRespnse;
    }
}
