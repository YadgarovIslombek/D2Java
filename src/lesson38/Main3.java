package lesson38;

import com.google.gson.Gson;

import java.io.*;


public class Main3 {
    public static void main(String[] args) {
        File f = new File("txtJson.txt");
        //Json -> text format
        //GSON - > json format -> Obj->string
        Gson gson = new Gson();
        Teacher user = new Teacher("Shohruh", "+998993577505");
        try {
            f.createNewFile();
            FileInputStream fileInputStream = new FileInputStream(f);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String row;
            StringBuilder stringBuilder = new StringBuilder();

            while ((row =bufferedReader.readLine())!=null){
                stringBuilder.append(row);
            }
            String s1 = stringBuilder.toString();
            System.out.println(s1);
            Teacher teacher = gson.fromJson(s1, Teacher.class);
            System.out.println(teacher.getName());
            System.out.println(teacher.getPhoneNumber());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
