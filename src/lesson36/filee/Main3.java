package lesson36.filee;

import java.io.*;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        File file = new File("first.txt");

        try {
            FileInputStream inputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String row;
            while ((row = bufferedReader.readLine())!=null) {
                ;
            System.out.println(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
