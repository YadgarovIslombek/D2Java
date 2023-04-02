package lesson33;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        list.add(new Person("Islombek", 20));
        list.add(new Person("Islombek1", 19));
        Collections.sort(list);


        //lymbada
//        list.sort(Comparator.comparing(Person::getName));


        System.out.println(list);
    }
}
