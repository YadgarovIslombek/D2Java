package lesson12;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = Main2.hello(s);
        System.out.println(s1);
    }

    static String hello(String name){
        return "Hello " + name;
    }
    //makeAbba
    //a -> Hi
    //b->Bye
    //return "HiByeByeHi"


}
