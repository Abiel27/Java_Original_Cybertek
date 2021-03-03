package src.Office_Hour_Recordings.Maps;

import java.util.Map;

public class Topping1 {

    public Map<String, String> topping1(Map<String, String> map) {

        map.put("bread", "butter");
        // butter, bread


        if(map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }

        return map;

    }

}
