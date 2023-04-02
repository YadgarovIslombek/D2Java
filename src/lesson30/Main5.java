package lesson30;
import java.util.Arrays;
public class Main5 {
    public static void main(String[] args) {
        int[] sonlar = new int[100];
        System.out.println(Arrays.toString(sonlar));
        for (int i = 0; i < sonlar.length; i++) {
            sonlar[i] = i;
        }
        System.out.println(Arrays.toString(sonlar));
        int[] a = evenArray(sonlar);
        for (int i: a) {
            System.out.println(i);
        }
    }
    static int[] evenArray(int[] massiv){
        int [] tempMassiv = new int[100];
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 != 0){
                tempMassiv[i] = i;
            }
        }
        return tempMassiv;
    }
}
