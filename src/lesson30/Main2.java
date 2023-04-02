package lesson30;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String[] weekday = new String[7];
        String []copyWeekDay = new String[weekday.length];
        weekday[0] = "Dushanba";
        weekday[1] = "Seshanba";
        weekday[2] = "Chorshanba";
        weekday[3] = "Payshanba";
        weekday[4] = "Juma";
        weekday[5] = "Shanba";
        weekday[6] = "Yakshanba";
        System.out.println("Bu weekday " + Arrays.toString(weekday));
        System.out.println("Bu copyweekday " + Arrays.toString(copyWeekDay));
        for (int i = 0; i < weekday.length; i++) {
            copyWeekDay[i] = weekday[i];
        }


        System.out.println("Bu weekday " + Arrays.toString(weekday));
        System.out.println("Bu copyweekday " + Arrays.toString(copyWeekDay));



    }
}
