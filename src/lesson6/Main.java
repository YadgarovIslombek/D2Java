package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hafta kunining sonini kiriting men sizga nomini yuboraman");
        int a = sc.nextInt();
        if (a==1){
            System.out.println("Dushanba");
        } else if (a == 2) {
            System.out.println("Seshanba");
        } else if (a==3) {
            System.out.println("Chorshanba");
        } else if (a == 4) {
            System.out.println("Payshanba");
        } else if (a == 5) {
            System.out.println("Juma");
        } else if (a == 6) {
            System.out.println("Shanba");
        } else if (a == 7) {
            System.out.println("Yakshanba");
        }else {
            System.out.println("Bunday hafta kuni yo'q");
        }
    }
}
