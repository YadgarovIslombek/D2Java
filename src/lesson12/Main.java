package lesson12;

public class Main {
    public static void main(String[] args) {
        Main.show();
        int a = Main.Hisobla(); //7
        String s = Main.harf();
        System.out.println(a);
        System.out.println(s);
    }
    // -> void -> qiymat qaytarmaydi.
    // -> qiymat qaytaradigan. -> tiplar (int double, string....)
    static void show(){
        System.out.println("Hello world");
    }
    static int Hisobla(){
       return 17;
    }
    static String harf(){
        return "sadasdas";
    }
}
