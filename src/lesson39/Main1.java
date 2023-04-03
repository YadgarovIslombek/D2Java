package lesson39;

import com.google.gson.Gson;

import java.io.*;

public class Main1 {
    public static void main(String[] args) {
        String a = "{\"name\":\"Islombek\",\"number\":\"+998993577505\"}";
        //parse
        Gson gson =new Gson();
        User user = gson.fromJson(a, User.class);
        System.out.println(a);
        System.out.println(user.getName());

        File file = new File("text.txt");

        try {
            file.createNewFile();
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String row="";
            StringBuilder stringBuilder = new StringBuilder();

            while ((row =bufferedReader.readLine())!=null){
                stringBuilder.append(row);
            }
            String s1 = stringBuilder.toString();
            User user1 = gson.fromJson(s1, User.class);
            System.out.println(user1.getNumber());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
