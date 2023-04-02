package lesson18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] massiv = new int[100];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = i+5;
        }
        System.out.println(Arrays.toString(massiv));
        Main.m1(massiv,5);
    }
    static void m1(int [] a, int b){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b){
                System.out.println(b +" sonining indexi " + i);
            }
        }
    }



}
