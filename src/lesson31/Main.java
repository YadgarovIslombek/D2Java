package lesson31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] massiv = new int[100];
        int count = 0;
        massiv[count++] = 1;
        massiv[count++] = 2;
        massiv[count] = 3;
        System.out.println(Arrays.toString(massiv));
        List list = new ArrayList();
        list.add("sdsd");
        list.add('$');
        list.add(12);
        list.add(12.5);
        list.add(12.5f);
        list.add(true);
        System.out.println(list);


    }
}
