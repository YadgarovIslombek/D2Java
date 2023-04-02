package lesson22;

import lesson22.Person;

public class Main {
    public static void main(String[] args) {
        //sub class -> bola class
        //super class -> ota class
        Person p = new Person();
        p.setName("Abdrim");
        p.setAge(25);
        p.setWork("Direktor");
        p.show();
        System.out.println(p);



        Developer d = new Developer();
//        Coder c = new Coder();
        d.setName("Rusik");
        d.setAge(30);
        d.setWork("ishchi");
        d.setSalary(1000);
        d.show();
    }
}
