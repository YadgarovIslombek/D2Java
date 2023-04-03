package lesson38;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main2 {
    public static void main(String[] args) {
        File f = new File("txtJson.txt");
        //Json -> text format
        //GSON - > json format -> Obj->string
        Gson gson = new Gson();
        Teacher user = new Teacher("Shohruh", "+998993577505");
        String s = gson.toJson(user);
        System.out.println(s);

        try {
            f.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(f);
            fileOutputStream.write(s.getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
