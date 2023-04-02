package lesson25;

public class Main {
    public static void main(String[] args) {
        TashqiClass t = new TashqiClass();
        TashqiClass.IchkiClass i = t.new IchkiClass();
        System.out.println(t.a = 10);
        System.out.println(i.b = 100 + t.a);
    }
}
