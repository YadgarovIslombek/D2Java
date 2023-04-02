package lesson33;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main6 {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();
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
