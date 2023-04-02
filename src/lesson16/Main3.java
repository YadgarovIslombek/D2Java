package lesson16;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] massiv = new int[a];//10

        for (int i = 0; i < massiv.length; i++) {
            massiv[i] += i*10;
        }
        System.out.println(Arrays.toString(massiv));

    }
}
