package OpenWeatherMap.JsonResponses;

import java.net.MalformedURLException;

public abstract class CurrentOwmResponse extends OwmResponse{
    private static final String JSON_COD = "cod";
    private static final String JSON_MESSAGE = "message";
    private static final String JSON_CNT = "cnt";

    private final int cod;
    private final double message;
    private final int cnt;

    public CurrentOwmResponse(String url) throws MalformedURLException {
        super(url);
        this.cod = this.getJsonRespnse().getJsonNumber(JSON_COD).intValue();
        if(this.getJsonRespnse().getJsonNumber(JSON_MESSAGE) != null) {
            this.message = this.getJsonRespnse().getJsonNumber(JSON_MESSAGE).doubleValue();
        }else{
            this.message = 0;
        }

        if(this.getJsonRespnse().getJsonNumber(JSON_CNT) != null) {
            this.cnt = this.getJsonRespnse().getJsonNumber(JSON_CNT).intValue();
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

    public int getCod() {
        return cod;
    }

    public double getMessage() {
        return message;
    }

    public int getCnt() {
        return cnt;
    }
}
