package lesson4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       if ((a + 5) > (b + 5)){
           System.out.println("Siz kiritgan sonlar orasida " + a +" katta");
       }else{
           System.out.println("Siz kiritgan sonlar orasida " + b +" katta");

       }

    }
}
