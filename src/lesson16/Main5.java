package lesson16;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] asosiy = new int[a];
        int[] juft = new int[asosiy.length];
        int[] juftIndex = new int[asosiy.length];
        int[] toq = new int[asosiy.length];

        for (int i = 0; i<asosiy.length; i++){
            asosiy[i] = i*10;
            if (i%2 == 0){
               juftIndex[i] = asosiy[i];
            }


            if (asosiy[i] % 2 == 0){
                juft[i] = asosiy[i];
            }else {
                toq[i] = i;
            }
        }
        System.out.println("Asosiy massiv " + Arrays.toString(asosiy));
        System.out.println("Juft sonlar massivi " + Arrays.toString(juft));
        System.out.println("Juft Indexlar massivi " + Arrays.toString(juft));
        System.out.println("Toq sonlar massivi " + Arrays.toString(toq));





    }
}
