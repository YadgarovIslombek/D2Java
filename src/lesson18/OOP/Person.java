package lesson18.OOP;

public class Person {
    String name;
    int age;

    String jinsi;

    int oyligi;

    //metodlari

    void show(){
        System.out.println("Ismi " + name );
        System.out.println("Yoshi " + age );
        System.out.println("Jinsi " + jinsi );
        System.out.println("Oyligi " + oyligi );
    }
    void walk(){
        System.out.println(name + " yuryapti");
    }
    void eat(){
        System.out.println(name + " yeyapti");
    }
    void sleep(){
        System.out.println(name + " uxlayapti");
    }
    void work(){
        System.out.println(name + " ishlayapti");
    }




}
