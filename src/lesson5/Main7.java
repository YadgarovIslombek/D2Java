package lesson5;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sanashManfiy = 0;
        int sanashMusbat = 0;

        if (a > 0) {
            sanashMusbat++;
        }else {
            sanashManfiy++;
        }
        if (b > 0) {
            sanashMusbat++;
        }else {
            sanashManfiy++;
        }
        if (c > 0) {
            sanashMusbat++;
        }else {
            sanashManfiy++;
        }
        System.out.println("Musbat sonlar " + sanashMusbat + " ta");
        System.out.println("Manfiy sonlar " + sanashManfiy + " ta");
    }
}
