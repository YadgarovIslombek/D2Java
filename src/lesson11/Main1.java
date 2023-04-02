package lesson11;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //Yanvar -> Qish
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        switch (s){
            case "Dekabr":
            case "Yanvar":
            case "Fevral":
                System.out.println("Qish");
                break;
            case "Mart":
            case "Aprel":
            case "May":
                System.out.println("Bahor");
                break;

        }
    }
}
