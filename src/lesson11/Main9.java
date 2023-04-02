package lesson11;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a = sc.next();
        replace(a);
    }
    static void replace(String a){
        String s = a.replace("a","o");
        System.out.println(s);
    }
}
