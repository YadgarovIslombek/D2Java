package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //123 - 1 2 3
        //     / - oddiy bo'lish     123 / 10 = 12
        //     % - qoldiqli bo'lish  123 % 10 = 3


        int birlik = a % 10; //566%10=6
        int onlik = a / 10 % 10; //566/10%10=6
        int yuzlik = a / 100; //5
//        System.out.print(birlik);
//        System.out.print(onlik);
//        System.out.print(yuzlik + "\n");
        //bir yuz yigirma uch
        switch (yuzlik) {
            case 1:
                System.out.print("Yuz ");
                break;
            case 2:
                System.out.print("Ikki Yuz ");
                break;
            case 3:
                System.out.print("Uch Yuz ");
                break;
            case 4:
                System.out.print("To'rt Yuz ");
                break;
            case 5:
                System.out.print("Besh Yuz ");
                break;
            case 6:
                System.out.print("Olti Yuz ");
                break;
            case 7:
                System.out.print("Yetti Yuz ");
                break;
            case 8:
                System.out.print("Sakkiz yuz ");
                break;
            case 9:
                System.out.print("To'qqiz Yuz ");
                break;
            default:
                System.out.println("xato");
        }

        switch (onlik) {
            case 1:
                System.out.print("O'n ");
                break;
            case 2:
                System.out.print("Yigirma ");
                break;
            case 3:
                System.out.print("O'ttiz ");
                break;
            case 4:
                System.out.print("Qirq ");
                break;
            case 5:
                System.out.print("Ellik5 ");
                break;
            case 6:
                System.out.print("Oltmish ");
                break;
            case 7:
                System.out.print("Yetmish ");
                break;
            case 8:
                System.out.print("Sakson ");
                break;
            case 9:
                System.out.print("To'qson ");
                break;
            default:
                System.out.println("xato");
        }
        switch (birlik) {
            case 1:
                System.out.print("Bir ");
                break;
            case 2:
                System.out.print("Ikki ");
                break;
            case 3:
                System.out.print("Uch ");
                break;
            case 4:
                System.out.print("To'rt ");
                break;
            case 5:
                System.out.print("Besh ");
                break;
            case 6:
                System.out.print("Olti ");
                break;
            case 7:
                System.out.print("Yetti5 ");
                break;
            case 8:
                System.out.print("Sakkiz ");
                break;
            case 9:
                System.out.print("To'qqiz ");
                break;
            default:
                System.out.println("xato");
        }
    }
}
