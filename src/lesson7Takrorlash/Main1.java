package lesson7Takrorlash;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a<=20){
            System.out.println("Konditsioner yoqildi");
        } else if (a > 20) {
            System.out.println("Konditsioner o'chirildi!");
        }else {
            System.out.println("Notog'ri buyruq");
        }
    }
}
