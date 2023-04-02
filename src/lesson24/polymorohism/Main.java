package lesson24.polymorohism;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        Object o  = "Start";   //down-casting
        String s1 = (String)o;//down-casting
        System.out.println(s1);

        String name = "Aziz";//up-casting
        int a2 = 10;
        Object obj = name + a2;//up-casting
        System.out.println(obj);

        Number n =1234567891;
        int i = (int) n; // downcasting
        Number n1 = i; //up-casting
        System.out.println(n1);




    }
}
