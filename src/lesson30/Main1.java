package lesson30;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        String[] weekday = new String[7];
        weekday[0] = "Dushanba";
        weekday[1] = "Seshanba";
        weekday[2] = "Chorshanba";
        weekday[3] = "Payshanba";
        weekday[4] = "Juma";
        weekday[5] = "Shanba";
        weekday[6] = "Yakshanba";

        //1-Usul
        System.out.println(weekday[0]);


        //2-Usul
        System.out.println(Arrays.toString(weekday));

        //3-Usul
        for (int i =0; i<weekday.length;i++){

            System.out.println(i);
            System.out.println(weekday[i]);
        }


        //4-Usul
        for (String i:weekday) {
            System.out.println(i);
        }

    }
}
