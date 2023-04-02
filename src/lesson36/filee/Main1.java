package lesson36.filee;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        try {
            FileWriter fileWriter = new FileWriter("first.txt",true);
            fileWriter.write(a + " ");
            fileWriter.close();
            System.out.println("Muffaqiyatli filega yozdingiz");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
