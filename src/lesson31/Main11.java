package lesson31;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main11 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Lazizbek");
        list.add("Lazizbek");
        list.add("Mustafo");
        list.add("Mirshod");
        list.add("Shohruh");

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("============");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        System.out.println("----------");

        list.forEach(System.out::println);

        System.out.println("-----------");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
