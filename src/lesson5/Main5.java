package lesson5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0){
            a++;
        } else if (a == 0) {
            a = 10;
        } else {
            a-=2;
        }
        System.out.println(a);
    }
}
