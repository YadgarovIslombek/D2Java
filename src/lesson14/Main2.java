package lesson14;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
       int a = Main2.length("Azizbek");
       System.out.println(a);
       if (a == 7){
           System.out.println("Kirish mumkin");
       }else {
           System.out.println("taqiqlanadi");
       }
    }
    static int length(String a){
        return a.length();
    }

}
