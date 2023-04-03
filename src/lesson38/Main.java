package lesson38;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

        //Json -> text format
        //GSON - > json format -> Obj->string
        String a = "{\"name\" : \"Azizbek\",\"phoneNumber\": \"+998993577505\"}"; //<-- json format
        System.out.println(a);
        Gson gson = new Gson();
        //to => biror nimaga "ga"
        //from => biror narsa "dan"

        Teacher user = gson.fromJson(a, Teacher.class);
        System.out.println(user.getName());
        System.out.println(user.getPhoneNumber());
    }
}
