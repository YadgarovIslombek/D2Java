package lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main4.SalomlashadiganMetod();




        Scanner klaviatura = new Scanner(System.in);
        System.out.print("1-son kiriting:");
        int a = klaviatura.nextInt();
        System.out.print("2-son kiriting:");
        int b = klaviatura.nextInt();
        System.out.println("Quyidagi Amallardan birini tanlang!");
        System.out.println("1-Qo'shish");
        System.out.println("2-Ayirish");
        System.out.println("3-Ko'paytirish");
        System.out.println("4-Bo'lish");
        int c = klaviatura.nextInt();

        if (c==1){
            System.out.println(a+b);
        }


    }

}
