package lesson4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = a * b;
        int p = 2 * (a+b);
        System.out.println("To'gri to'rtburchakning yuzi: " + s);
        System.out.println("To'gri to'rtburchakning peremetri: " + p);

    }
}
