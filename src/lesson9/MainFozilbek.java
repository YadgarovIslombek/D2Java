package lesson9;

import java.util.Scanner;

public class MainFozilbek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a son katta" + a);
        } else if (b > a) {
            System.out.println("b son katta" + b);

        } else {
            System.out.println("ikki son hamm teng");
        }

        for ( int i = 1; i <= 100; i+=2 ) {
            System.out.println(i);
        }

    }

}
