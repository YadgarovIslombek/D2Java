package lesson14;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = Main1.replace(s);
        System.out.println(a);
    }
    static String replace(String a){
        return a.replace("Park","djfhdjf");
    }

}
