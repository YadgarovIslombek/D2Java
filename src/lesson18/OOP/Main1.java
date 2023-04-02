package lesson18.OOP;

public class Main1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Shohruh";
        p1.age = 19;
        p1.jinsi = "Erkak";
        p1.oyligi = 0;
        p1.show();
        p1.walk();
        p1.eat();
        p1.sleep();
        System.out.println("------------------------------------------------------");

        Person p2 = new Person();
        p2.name = "Azizbek";
        p2.age = 12;
        p2.jinsi = "M";
        p2.oyligi = 0;
        p2.sleep();

        p2.show();

    }
}
