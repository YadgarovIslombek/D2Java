package lesson33;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main7 {
    public static void main(String[] args) {

        Set<String> set = new TreeSet <>();
        set.add("Mirshod");
        set.add("Abdulaziz");
        set.add("Shohruh");
        set.add("Shohruh");
        set.remove("Shohrux");
        set.add("Xosiyat");
        System.out.println(set.size());

        System.out.println(set);

    }
}
