package lesson9;

import java.util.Scanner;

public class MainAbdullaziz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0){
            System.out.println("Musbat son");
        } else if (a < 0) {
            System.out.println("Manfiy son");
        }else {
            System.out.println("nolga teng");
        }

        for (int i = 0; i <=a; i++) {
            System.out.println(i);
        }

    }
}
