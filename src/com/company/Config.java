package com.company;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import Factorial.*;

public class Config {
    public static String Value = "recursive";

    String getFactorialMethod(String key) {
        String method = "";
        JSONParser jsonParser = new JSONParser();
        try {
            Object object = jsonParser.parse(new FileReader("config.json"));
            JSONObject parser = (JSONObject) object;
            method = (String) parser.get(key);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (Value.equals(method)){
            Main.value = Value;
        }
        return method;
    }
}
