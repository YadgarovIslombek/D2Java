package lesson35;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // map //key->value

        Map<String,String> map  = new HashMap<>();

        map.put("Kitob", "Book");
        map.put("Daftar", "nootbook");
        map.remove("Daftar");
        map.put("Gazeta","Journal");


        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string);
            System.out.println(map.get(string));
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }

    }
}
