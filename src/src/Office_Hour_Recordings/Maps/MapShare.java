package src.Office_Hour_Recordings.Maps;

import java.util.Map;

public class MapShare {


    public Map<String, String> mapShare(Map<String, String> map) {

        map.remove("c");

        if(map.containsKey("a")) {
            map.put("b", map.get("a"));
        }

        return map;

    }



}
