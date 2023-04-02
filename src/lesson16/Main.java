package lesson16;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();//10
        int[] massiv = new int[a];

        System.out.println(Arrays.toString(massiv));

        for (int i = 0; i<massiv.length; i++){
            massiv[i] = i;
        }
        System.out.println(Arrays.toString(massiv));

    }
}
