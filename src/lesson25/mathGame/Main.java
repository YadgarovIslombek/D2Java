package lesson25.mathGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;
        while (b) {
            System.out.println("1->Choose level\n2->Exit");
            int chooseMenu = sc.nextInt();
            switch (chooseMenu) {
                case 1:
                    Level[] l = Level.values();
                    for (int i = 0; i < l.length; i++) {
                        System.out.println(i + 1 + "->" + l[i]);

                    }
                    int chooseLevel = sc.nextInt() - 1;
                    Level le = l[chooseLevel];

                    switch (le) {
                        case Low:
                            Main.setMax(10);
                            break;
                        case Medium:
                            Main.setMax(100);
                            break;
                        case High:
                            Main.setMax(1000);
                            break;
                    }
                    break;
                case 2:
                    b = false;
                    System.out.println("Getavar");
                    break;
            }
        }
    }

     static void setMax(int max) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int a = r.nextInt(max);
        int b = r.nextInt(max);
        int c = r.nextInt(4);
         System.out.println(c);
        int result=0;
        switch (c) {
            case 0:
                result = a + b;
                System.out.println(a + " + " + b +" = ");
                break;
            case 1:
                result = a - b;
                System.out.println(a + " - " + b +" = ");
                break;
            case 2:
                result = a * b;
                System.out.println(a + " * " + b +" = ");
                break;
            case 3:
                result = a / b;
                System.out.println(a + " / " + b +" = ");
                break;

        }
        int userJavob = sc.nextInt();
        if (result == userJavob){
            System.out.println("Zorsanqu");
        }else {
            System.out.println("2 chi sanqu");
        }
    }


}
