package lesson5;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int sanash  = 0;

       if (a > 0){
           sanash++;
       }
       if (b > 0 ){
           sanash++;
       }
       if (c > 0){
           sanash++;
       }
        System.out.println("Musbat sonlar " + sanash + " ta");
    }
}
