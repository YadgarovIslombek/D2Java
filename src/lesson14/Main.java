package lesson14;

public class Main {
    public static void main(String[] args) {
    boolean b = Main.makes10(33,1);
        System.out.println(b);


    }
    static boolean makes10(int a, int b) {
     if (a == 10 || b == 10){
         return true;
     }else {
         return false;
     }



    }



}
