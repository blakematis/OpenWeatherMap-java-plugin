package JSON;


import javax.json.*;
import javax.json.stream.JsonParser;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Logger;

import static javax.json.stream.JsonParser.Event.*;

/**
 * JSonParser parses a JSON file into a HashMap.
 *
 * AUTHOR: BLAKE MATIS
 * DATE CREATED: 1/10/2019
 * COMPANY: ENERDAPT INC.
 */
public class JSONParser {


/*--------------------DATA FIELDS------------------------*/
    private String API_URL_STRING;
    private URL API_URL;
    private HashMap JSON_MAP;
    private static Logger logger = Logger.getLogger(Logger.class.getName());

    public static void main(String [] args) throws MalformedURLException {
        JSONParser jsonParser = new JSONParser("https://api.openweathermap.org/data/2.5/forecast?q=Roseville,US&units=imperial&appid=e513347207aae03c792f055e744790e4");
        jsonParser.parseJSON();
        //logger.info(jsonParser.JSON_MAP.toString());
    }

    public JSONParser(String API_URL_STRING){
        this.API_URL_STRING = API_URL_STRING;
    }

    public JSONParser(URL API_URL){
        this.API_URL = API_URL;
    }

    public void parseJSON() throws MalformedURLException {
        parseJSON(API_URL_STRING);
    }

    public void parseJSON(String API_URL) throws MalformedURLException{
        URL url = new URL(API_URL);
        parseJSON(url);
    }

    public void parseJSON(URL API_URL){
        HttpURLConnection conn = null;
        JsonParser jsonParser = null;
        try{
            conn = (HttpURLConnection) API_URL.openConnection();
            conn.setRequestMethod("GET");
            //jsonParser = Json.createParser(conn.getInputStream());
            JsonReader jsonReader = Json.createReader(conn.getInputStream());
            System.out.println(jsonReader.read().asJsonObject().getJsonArray("list"));
            System.out.println();
            //JSON_MAP = parseJSON(jsonParser, new HashMap(), new LinkedList());
        } catch (IOException e){
            logger.warning(e.getMessage());
        }finally {
            conn.disconnect();
        }

    }

    private HashMap parseJSON(JsonParser jsonParser, HashMap jsonMap, LinkedList keyNames) {
        if(jsonParser.hasNext()){
            final JsonParser.Event event = jsonParser.next();
            System.out.println(event.name());
            switch (event) {
                case START_OBJECT:
                    return parseJSON(jsonParser, jsonMap, keyNames);
                case END_OBJECT:
                    return parseJSON(jsonParser, jsonMap, keyNames);
                case START_ARRAY:
                    return parseJSON(jsonParser, jsonMap, keyNames);
                case END_ARRAY:
                    return parseJSON(jsonParser, jsonMap, keyNames);
                case KEY_NAME:
                    keyNames.add(jsonParser.getString());
                    parseJSON(jsonParser, jsonMap, keyNames);
                    return parseJSON(jsonParser, jsonMap, keyNames);
                case VALUE_NULL:
                    return parseJSON(jsonParser, jsonMap, keyNames);
                case VALUE_TRUE:
                    return parseJSON(jsonParser, jsonMap, keyNames);
                case VALUE_FALSE:
                    return parseJSON(jsonParser, jsonMap, keyNames);
                case VALUE_NUMBER:
                    jsonMap.put(keyNames.pop(), jsonParser.getInt());
                    return parseJSON(jsonParser, jsonMap, keyNames);
                case VALUE_STRING:
                    jsonMap.put(keyNames.pop(), jsonParser.getString());
                    return parseJSON(jsonParser, jsonMap, keyNames);
                default:
                    System.out.println("parsed event not recognized");
                    return parseJSON(jsonParser, jsonMap, keyNames);
            }
        }else{
            return jsonMap;
        }
    }



/*-----------------GETTERS AND SETTERS-------------------*/
    public String getAPI_URL_STRING() {
        return API_URL_STRING;
    }

    public void setAPI_URL_STRING(String API_URL_STRING) {
        this.API_URL_STRING = API_URL_STRING;
    }

    public URL getAPI_URL() {
        return API_URL;
    }

    public void setAPI_URL(URL API_URL) {
        this.API_URL = API_URL;
    }

}
