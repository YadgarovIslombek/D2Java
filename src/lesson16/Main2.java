package lesson16;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String[] names = {"Farxod","Azizbek","Fozilbek","Shohrux","Abdulaziz"};
        String [] names2 = new String[names.length];
         for (int i = 0; i<names.length; i++){
            for (int j = 0; j<=i;j++){
                if (names[j].equals("Farxod")){
                    continue;
                }else {

                names2[i] = names[j];
                }
            }
        }
        System.out.println(Arrays.toString(names2));

    }
}
