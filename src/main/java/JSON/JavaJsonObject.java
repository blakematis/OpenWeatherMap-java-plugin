package JSON;

import javax.json.JsonObject;
import javax.json.JsonReader;

public interface JavaJsonObject {

    public JavaJsonObject build(JsonReader jsonReader);

    public JsonObject buildJson();

}
