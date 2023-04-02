package lesson33;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        String[] massiv = new String[10];
        int count = 0;
        massiv[count++]  = "Mustafo";
        massiv[count++]  = "Mirshod";
        massiv[count++]  = "Abdulaziz";
        massiv[count++]  = "Shohruh";
        massiv[count++]  = "Lazizbek";
        System.out.println(Arrays.deepToString(massiv));
        Arrays.sort(massiv,0,count);
        System.out.println(Arrays.deepToString(massiv));

    }
}
