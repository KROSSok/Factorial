package com.company;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class Config {
    public static String value = "recursive";
    String getFactorialMethod(String file, String key) {
        String method = "";
        RecFactorial rFac = new RecFactorial();
        Factorial fac = new Factorial();
        int result = 0;
        JSONParser jsonParser = new JSONParser();
        try {
            Object object = jsonParser.parse(new FileReader(file));
            JSONObject parser = (JSONObject) object;
            method = (String) parser.get(key);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return method;
    }
}
