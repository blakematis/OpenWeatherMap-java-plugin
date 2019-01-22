package JSON;

import javax.json.Json;
import javax.json.JsonReader;
import javax.json.stream.JsonParser;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Logger;

public class JSONReader {
    private String API_URL_STRING;
    private URL API_URL;
    private JsonReader jsonReader;
    private static Logger logger = Logger.getLogger("JSONReader");

    public JSONReader(String API_URL_STRING)throws Exception{
        this(new URL(API_URL_STRING));
    }

    public JSONReader(URL url){
        this.API_URL = url;
        this.API_URL_STRING = url.toString();
    }

    public JsonReader getJsonReader(){
        try{
            HttpURLConnection conn = (HttpURLConnection) API_URL.openConnection();
            conn.setRequestMethod("GET");
            //jsonParser = Json.createParser(conn.getInputStream());
            JsonReader jsonReader = Json.createReader(conn.getInputStream());
            return jsonReader;
        } catch (IOException e) {
            logger.warning(e.getMessage());
        }
        return null;
    }






}
