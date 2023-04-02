package lesson6;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hafta kunini son ko'rinishida kiriting!");
        int a = sc.nextInt();

        switch(a){
            case 1:
                System.out.println("Dushanba");
                break;
            case 2:
                System.out.println("Seshanba");
                break;
            case 3:
                System.out.println("Chorshanba");
                break;
            case 4:
                System.out.println("Payshanba");
                break;
            case 5:
                System.out.println("Juma");

            case 6:
                System.out.println("shanba");

            case 7:
                System.out.println("Yakshanba");

            default:
                System.out.println("Bunday hafta kuni yoq");
        }
    }
}
