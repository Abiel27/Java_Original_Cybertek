package src.Office_Hour_Recordings.Maps;

import java.util.Map;

public class MapBully {

    public Map<String, String> mapBully(Map<String, String> map) {

        if(map.containsKey("a")) {
            String value = map.get("a");
            map.put("b", value);
            map.put("a", "");
        }

        return map;

    }



}
