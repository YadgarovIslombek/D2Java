package lesson26;

public class Main {
    public static void main(String[] args) {
        String[] a = {"Clashdosh, sinfdosh,partadosh,suhbatdosh,maktab, class"};
        for (int i = 0; i < a.length; i++) {
            String bb = a[i];
            if (bb.endsWith("dosh")) {
                System.out.println(a[i]);

            } else {
                System.out.println("sdsds");
            }
        }
    }
}