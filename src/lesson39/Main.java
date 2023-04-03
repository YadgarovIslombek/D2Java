package lesson39;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
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
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(a.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
