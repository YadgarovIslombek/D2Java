package lesson36.filee;

import java.io.*;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        File file = new File("first.txt");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        try {
            FileOutputStream outputStream = new FileOutputStream(file,true);
            byte[] bytes = a.getBytes();
            outputStream.write(bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
