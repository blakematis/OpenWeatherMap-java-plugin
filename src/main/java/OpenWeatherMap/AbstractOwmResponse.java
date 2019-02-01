package OpenWeatherMap;

import javax.json.JsonObject;
import java.net.MalformedURLException;

public abstract class AbstractOwmResponse {

    private static final String JSON_COD = "cod";
    private static final String JSON_MESSAGE = "message";
    private static final String JSON_CNT = "cnt";

    private final String url;
    private final JsonObject jsonRespnse;
    private final String cod;
    private final double message;
    private final int cnt;

    public AbstractOwmResponse(String url) throws MalformedURLException{
        this.url = url;
        this.jsonRespnse = OpenWeatherMapUtil.jsonReply(url);

        this.cod = jsonRespnse.getJsonString(JSON_COD).getString();
        this.message = jsonRespnse.getJsonNumber(JSON_MESSAGE).doubleValue();
        if(jsonRespnse.getJsonNumber(JSON_CNT) != null) {
            this.cnt = jsonRespnse.getJsonNumber(JSON_CNT).intValue();
        }else{
            this.cnt = 0;
        }
    }

    public static String getJsonCod() {
        return JSON_COD;
    }

    public static String getJsonMessage() {
        return JSON_MESSAGE;
    }

    public static String getJsonCnt() {
        return JSON_CNT;
    }

    public String getUrl() {
        return url;
    }

    public JsonObject getJsonRespnse() {
        return jsonRespnse;
    }

    public String getCod() {
        return cod;
    }

    public double getMessage() {
        return message;
    }

    public int getCnt() {
        return cnt;
    }
}
