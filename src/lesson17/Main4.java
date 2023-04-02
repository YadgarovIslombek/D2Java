package lesson17;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Son kiriting:");
        double a = sc.nextDouble();
        System.out.print("Sonni darajasini kiriting:");
        double b = sc.nextDouble();

        double natija = Main4.daraja(a,b);
        System.out.println(a+ " sonining " + b + " darajasi " + natija + " ga teng!");
    }

    static double daraja(double a, double b){
        return Math.pow(a,b);
    }
}
