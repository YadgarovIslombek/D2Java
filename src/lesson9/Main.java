package lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1-son kiriting:");
        int a = sc.nextInt();
        System.out.print("2-son kiriting:");
        int b = sc.nextInt();
        System.out.println("Quyidagi Amallardan birini tanlang!");
        System.out.println("1-Qo'shish");
        System.out.println("2-Ayirish");
        System.out.println("3-Ko'paytirish");
        System.out.println("4-Bo'lish");
        int c = sc.nextInt();


        switch (c){
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Bunday buyruq yo'q");
        }
    }
}
