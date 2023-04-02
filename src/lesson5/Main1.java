package lesson5;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        5 % 2 = 1     <--------  qoldiqli bo'lish
//        5 / 2 = 2  (1qoldik)   <----- Oddiy bo'lish
        if(a%2==0 ) {
            System.out.println("juft son");
        }else if(a%2==1){
            System.out.println("toq son");
        }else {
            System.out.println("manfiy son!");
        }
    }


}
