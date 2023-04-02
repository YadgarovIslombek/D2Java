package lesson4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0){ //-1 > 0 //no false
            a++; //a = a +1
        }else {
            a = a + 2;
        }
        System.out.println(a);


    }
}
