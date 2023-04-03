package lesson38;

import com.google.gson.Gson;

import java.io.File;


public class Main1 {
    public static void main(String[] args) {

        //Json -> text format
        //GSON - > json format -> Obj->string
        Gson gson = new Gson();
        Teacher user = new Teacher("Shohruh", "+998993577505");
        String s = gson.toJson(user);
        System.out.println(s);

    }
}
