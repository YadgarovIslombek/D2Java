package lesson36;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Son kiriting");
        int a = sc.nextInt();
        try {
            System.out.println(a / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Bu xatolikdan keyin");
    }
}
