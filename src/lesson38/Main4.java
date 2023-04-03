package lesson38;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class Main4 {
    public static void main(String[] args) {
        List<Teacher> list = new ArrayList<>();
        list.add(new Teacher("Islombek","+9989"));
        list.add(new Teacher("Mirshod","+9989"));
        list.add(new Teacher("Abdulaziz","+9989"));
        list.add(new Teacher("Lazizbek","+9989"));



        for (Teacher teacher : list) {
            System.out.println(teacher);
        }

        Gson gson = new Gson();
        String s = gson.toJson(list);
        System.out.println(s);
        System.out.println("===============================================");

        Type type = new TypeToken<List<Teacher>>() {
        }.getType();
        List<Teacher>list1 = gson.fromJson(s, type);
        for (Teacher teacher : list1) {
            System.out.println(teacher.getName());
        }

//        Teacher[] teacher = gson.fromJson(s, Teacher[].class);
//        for (Teacher teacher1 : teacher) {
//            System.out.println(teacher1);
//        }


    }
}
