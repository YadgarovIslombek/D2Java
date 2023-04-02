package lesson34;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // key -> value
        Map<String,String> map = new HashMap<>();
        map.put("Car","Mashina");
        map.put("School","Maktab");
        map.put("Apple","Olma");

        Set<String> strings = map.keySet();
        for (String a : strings){
            System.out.println(a);
        }

        List<String> list = new ArrayList<>();



    }
}
