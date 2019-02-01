package OpenWeatherMap.JsonData;

import JSON.AbstractJsonObj;

import javax.json.JsonObject;

public abstract class AbstractOwmJsonObj  extends AbstractJsonObj{


    public AbstractOwmJsonObj(JsonObject jsonObject) {
        super(jsonObject);
    }
}
