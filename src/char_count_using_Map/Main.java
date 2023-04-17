package char_count_using_Map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String string = "The Map interface provides three collection views";
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] array = string.split(" ");
        string = "";
        for (String s : array) {
            string += s.toUpperCase();
        }
        System.out.println(string);
        array = string.split("");
        for (String s : array) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> item : set){
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }
}
