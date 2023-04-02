package lesson6;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Robot qaysi tamonga qarab turibdi:\nTanlang:\ns-Shimol\nj-janub\nq-sharq\ng-garb");
        String Y = sc.next();
        System.out.println("Harakatni kiriting:\n0-harakatni davom ettir.\n1-chapga buril.\n2-o'nga buril.\n3-orqaga");
       int K = sc.nextInt();
       switch (Y){
           case "s":
               if (K == 0){
                   System.out.println("Robot shimolga qarab turibdi!");
               } else if (K == 1) {
                   System.out.println("Robot G'arbga qarab turibdi!");
               } else if (K == 2) {
                   System.out.println("Robot Sharqga qarab turibdi!");
               } else if (K == 3) {
                   System.out.println("Robot Janubga qarab turibdi!");
               }else {
                   System.out.println("Bunday buyruq yo'q");
               }
               break;
           case "j":

               //BU YERGA SIZLAR CODE YOZISHLARINGIZ KERAK
           case "q":
               //BU YERGA SIZLAR CODE YOZISHLARINGIZ KERAK
           case "g":
               //BU YERGA SIZLAR CODE YOZISHLARINGIZ KERAK
       }


    }
}
