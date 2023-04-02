package lesson31;

import java.util.ArrayList;
import java.util.List;

public class Main8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Lazizbek");
        list.add("Mirshod");
        list.add("Shohruh");
        list.add("Fozil");
        System.out.println(list);

        List<String> list1 = new ArrayList<>();

        list1.add("Mirshod");
        list1.add("Shohruh");
        list1.add("Lazizbek");


        System.out.println(list.contains("Mirshod"));
        System.out.println(list.containsAll(list1));

    }
}
