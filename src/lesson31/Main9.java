package lesson31;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Lazizbek");
        list.add("Lazizbek");
        list.add("Mirshod");
        list.add("Shohruh");
        list.removeIf(s -> s.equalsIgnoreCase(" "));

        System.out.println(list);

//        List<String> list1 = new ArrayList<>();
//        list1.add("Fozil");
//        list1.add("Mustafo");
//        list1.add("Abdulaziz");
//        list.addAll(1,list1);



    }
}
