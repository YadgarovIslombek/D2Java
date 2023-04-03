package lesson39.bookAppConsole.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lesson39.bookAppConsole.models.Book;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class FileServiceImpl implements FileService {
    File file = new File("Library2.txt");
    Gson gson = new Gson();
    @Override
    public void write(List<Book> list, boolean isAppend) {
        try {
            file.createNewFile();

            FileOutputStream fileOutputStream = new FileOutputStream(file,isAppend);
            String s = gson.toJson(list);
            fileOutputStream.write(s.getBytes());
            fileOutputStream.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Book> getBookList() {
        List<Book> list = new ArrayList<>();

        try {
            FileInputStream inputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader  = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String row;
            StringBuilder stringBuilder = new StringBuilder();

            while ((row =bufferedReader.readLine())!=null){
                stringBuilder.append(row);
//                String[] s = row.split("\\$");
//                Book book = new Book(s[0],s[1],s[2],Integer.parseInt(s[3]),s[4]);
//                list.add(book);
            }
            inputStream.close();
            String s1 = stringBuilder.toString();
            Type type = new TypeToken<List<Book>>() {}.getType();
            list = gson.fromJson(s1, type);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        return list;
    }
}
