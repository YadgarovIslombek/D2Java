package lesson33;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        Person p = new Person("Islombek", 19);
        Person p1 = new Person("Abdulaziz", 20);
        list.add(p);
        list.add(p1);
        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        //lymbada
//        list.sort(Comparator.comparing(Person::getName));


        System.out.println(list);
    }
}
