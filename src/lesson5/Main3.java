package lesson5;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0) {
            System.out.println("musbat son");
        }else if(a<0){
            System.out.println("manfiy son");
        }else {
            System.out.println("nolga teng");
        }
    }


}
