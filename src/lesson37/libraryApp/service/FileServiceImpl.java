package lesson37.libraryApp.service;

import lesson37.libraryApp.models.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileServiceImpl implements FileService {
    File file = new File("Library.txt");
    @Override
    public void write(String name, boolean isAppend) {
        try {
            file.createNewFile();

            FileOutputStream fileOutputStream = new FileOutputStream(file,isAppend);
            fileOutputStream.write(name.getBytes());
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

            while ((row =bufferedReader.readLine())!=null){
                String[] s = row.split("\\$");
                Book book = new Book(s[0],s[1],s[2],Integer.parseInt(s[3]),s[4]);
                list.add(book);
            }
            inputStream.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        return list;
    }
}
