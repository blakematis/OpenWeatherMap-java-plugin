package OpenWeatherMap.JsonData;

import JSON.AbstractJsonObj;

import javax.json.JsonObject;

public abstract class OwmJsonObj extends AbstractJsonObj{


    public OwmJsonObj(JsonObject jsonObject) {
        super(jsonObject);
    }
}
