package lesson16;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] massiv = new int[a];//10
        // 3 va 5 bo'linadigan sonlarni topish massiv ichidan
        for (int i = 0; i< massiv.length; i++){
            massiv[i] = i;
            if (massiv[i] % 3 == 0 && massiv[i] % 5 == 0){
                System.out.println(massiv[i]);
            }
        }
    }
}
