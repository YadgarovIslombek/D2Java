package lesson33;

import java.util.Comparator;

public class Person implements Comparable<Person>,Comparator<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}
