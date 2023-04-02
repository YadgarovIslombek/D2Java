package lesson12;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String i = sc.next();
        String c = sc.next();
        String a = Main3.makeAbba(i,c);
        System.out.println(a);
    }

    static String makeAbba(String a,String b){
        return a + b + b + a;
    }


}
