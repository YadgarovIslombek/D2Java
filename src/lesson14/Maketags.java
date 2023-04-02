package lesson14;

import java.util.Scanner;

public class Maketags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s = Maketags.makeTags(s1,s2);
        System.out.println(s);
    }
    static String makeTags(String a, String b){
        return "<" + a + ">" + b + "</" + a + ">";
    }
}
