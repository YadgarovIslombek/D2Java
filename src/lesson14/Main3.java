package lesson14;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = Main3.equals(a,b);
        System.out.println(c);
    }
    static String equals(String a,String b){
        if (a.equals("Azizbek")){
            return "Kirish mumkin emas!";
        }
        else {
            return "Sizda ruxsat yoq";
        }
    }

}
