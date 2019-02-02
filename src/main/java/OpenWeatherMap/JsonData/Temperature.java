package OpenWeatherMap.JsonData;

import javax.json.JsonObject;


/**
 * Temperature specifically gets used when using the daily? query.
 */
public class Temperature extends OwmJsonObj {

    public static final String JSON_DAY = "day";
    public static final String JSON_MIN = "min";
    public static final String JSON_MAX = "max";
    public static final String JSON_NIGHT = "night";
    public static final String JSON_EVE = "eve";
    public static final String JSON_MORN = "morn";

    private final double day;
    private final double min;
    private final double max;
    private final double night;
    private final double eve;
    private final double morn;


    public Temperature(JsonObject jsonObject) {
        super(jsonObject);
        this.day = this.getJsonObject().getJsonNumber(JSON_DAY).doubleValue();
        this.min = this.getJsonObject().getJsonNumber(JSON_MIN).doubleValue();
        this.max = this.getJsonObject().getJsonNumber(JSON_MAX).doubleValue();
        this.night = this.getJsonObject().getJsonNumber(JSON_NIGHT).doubleValue();
        this.eve = this.getJsonObject().getJsonNumber(JSON_EVE).doubleValue();
        this.morn = this.getJsonObject().getJsonNumber(JSON_MORN).doubleValue();
    }

    public double getDay() {
        return day;
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public double getNight() {
        return night;
    }

    public double getEve() {
        return eve;
    }

    public double getMorn() {
        return morn;
    }

}
