package lesson31;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Lazizbek");
        list.add("Mirshod");
        list.add("Shohruh");
        System.out.println(list.get(1));
        System.out.println(list.set(1,"Java"));
        System.out.println(list);

    }
}
