package lesson36;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Son kiriting");
        int a = sc.nextInt();
        try {
            for (int i = -10; i <= 10; i++) {
                System.out.println(a / i);
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Bu xatolikdan keyin");
    }
}
