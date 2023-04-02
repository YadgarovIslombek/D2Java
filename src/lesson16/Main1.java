package lesson16;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String[] names = {"Farxod","Azizbek","Fozilbek","Shohrux","Abdulaziz"};
        for (int i = 0; i<names.length; i++){
            if (names[i].equals("Fozilbek")){
                System.out.println(names[i]+" ismli foydalanuvchi sizga kirish mumkin emas!");
            }else {
                System.out.println(names[i]+" ismli foydalanuvchi sizga kirish mumkin!");
            }
        }

    }
}
