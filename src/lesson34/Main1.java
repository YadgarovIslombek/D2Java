package lesson34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        // key -> value
        Map<String,String> map = new HashMap<>();
        map.put("Car","Mashina");
        map.put("School","Maktab");
        map.put("Apple","Olma");

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            if (entry.getKey().equalsIgnoreCase("Car")){
                entry.setValue("Mashin");
            }
        }
        System.out.println(map);

        System.out.println(map.containsKey("Car"));
    }

}
