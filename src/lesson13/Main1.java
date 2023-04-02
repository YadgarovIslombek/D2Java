package lesson13;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int c = sc.nextInt();
        int a = Main1.yigindi(i,c);
        System.out.println(a);
    }
    static int yigindi(int a,int b){
        return a+b;
    }
}
