package lesson30;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] sonlar = new int[100];
        for (int i = 0; i < sonlar.length; i++) {
            sonlar[i] = i;
        }
        System.out.println(Arrays.toString(sonlar));
        int [] sonlar2 = new int[sonlar.length];

        for (int i = 0; i < sonlar2.length; i++) {
            sonlar2[i] = sonlar[i]*10;
        }
        System.out.println(Arrays.toString(sonlar2));

    }
}
