package lesson13;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int yosh = sc.nextInt();
        String i =Main2.info(name,yosh);
        System.out.println(i);
    }
    static String info(String name,int yosh){
        return "Ismi: " + name + "\n" + "Yoshi: " + yosh;
    }

}
