package lesson36.filee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        File file = new File("first.txt");


        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()){
                String s = sc.nextLine();
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



    }
}
