package JSON;

import javax.json.JsonObject;

public interface JavaJsonObject {

    JavaJsonObject build(JsonObject jsonObject);

    JsonObject buildJson();

}
