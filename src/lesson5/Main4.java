package lesson5;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a!=0 && a%2==0 && a>0){
            System.out.println("juft son");
        } else if (a % 2 == 1) {
            System.out.println("toq son");
        } else if (a == 0) {
            System.out.println("nolga teng!");
        } else {
            System.out.println("kiritilgan son manfiy son");
        }
    }
}
