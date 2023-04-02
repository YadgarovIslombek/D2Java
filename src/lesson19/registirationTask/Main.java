package lesson19.registirationTask;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User[] db =new User[100];
        int index = 0;
        while(true){
            System.out.println("1->Ro'yhatdan o'tish\n2->Tizimga kirish");
            int a = sc.nextInt();

            if (a == 1){
                System.out.println("Ismingizni kiriting");
                String name = sc.next();
                System.out.println("Familiyangizni kiriting");
                String fname = sc.next();
                System.out.println("Yoshingizni kiriting");
                int age = sc.nextInt();
                System.out.println("Emailingizni kiriting");
                String email = sc.next();
                System.out.println("Parolingizni kiriting");
                String parol = sc.next();
                User u1 = new User(name,fname,age,email,parol);
                db[index] = u1;
                index++;
            } else if (a == 2) {
                System.out.println(Arrays.toString(db));
                System.out.println("Tizimga kirish!");
                System.out.println("Emailingizni kiriting.");
                String email = sc.next();
                System.out.println("Parolingizni kiriting.");
                String parol = sc.next();

                for (int i = 0; i<index; i++){
                    if (db[i].email.equals(email) && db[i].parol.equalsIgnoreCase(parol)){
                        System.out.println("Tizimga xush kelibsiz");
                    }else {
                        System.out.println("Parol yoki login xato");
                    }
                }
            }

        }




    }
}
