package lesson34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        //1,0,2,6,3 temp = 0 array[i] = temp array[i+1] = i
        // key -> value
        Map<String,String> map = new HashMap<>();
        map.put("Car","Mashina");
        map.put("School","Maktab");
        map.put("Apple","Olma");

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
        System.out.println(map);
        map.remove("Car");
        System.out.println(map);
        map.put("Car","Mash");
        System.out.println(map);
        map.clear();
        System.out.println(map);
    }

}
