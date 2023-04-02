package lesson15;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        int[] oykunlari = new int[12];
        oykunlari[0] = 31;
        oykunlari[1] = 28;
        oykunlari[2] = 31;
        oykunlari[3] = 30;
        oykunlari[4] = 31;
        oykunlari[5] = 30;
        oykunlari[6] = 31;
        oykunlari[7] = 31;
        oykunlari[8] = 30;
        oykunlari[9] = 31;
        oykunlari[10] = 30;
        oykunlari[11] = 31;

        System.out.println(Arrays.toString(oykunlari));


        for (int i=0; i < 11;i++){
            System.out.println(oykunlari[i]);
        }


    }
}
