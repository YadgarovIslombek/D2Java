package lesson21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yoshingizni ");

        Person p1  = new Person("Islombek",19,"Dasturchi",1000);
        p1.show();
        System.out.println("Qancha muddat ishladingiz yozing.");
        int a = sc.nextInt();
        p1.calcSalary(a);
        Person p2 = new Person("Azizbek",15,"Dasturchi",2000);
        p2.show();
        System.out.println("Qancha muddat ishladingiz yozing.");
        int b = sc.nextInt();
        p2.calcSalary(b);
    }
}
