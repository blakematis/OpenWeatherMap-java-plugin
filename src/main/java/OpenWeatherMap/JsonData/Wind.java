package OpenWeatherMap.JsonData;

import javax.json.*;

public class Wind extends OwmJsonObj {

    private static final String JSON_SPEED = "speed";
    private static final String JSON_DEG = "deg";

    private final double speed;
    private final double deg;

    public Wind(JsonObject jsonObject){
        super(jsonObject);
        this.speed = this.getJsonObject().getJsonNumber(JSON_SPEED).doubleValue();
        this.deg = this.getJsonObject().getJsonNumber(JSON_DEG).doubleValue();
    }

    public double getSpeed() {
        return speed;
    }

    public double getDeg(){
        return deg;
    }

}
