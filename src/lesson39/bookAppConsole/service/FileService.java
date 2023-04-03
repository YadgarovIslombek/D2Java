package lesson39.bookAppConsole.service;

import lesson39.bookAppConsole.models.Book;

import java.util.List;

public interface FileService {
    List<Book> getBookList();
//    void write(String s, boolean isAppend);
    void write(List<Book> list, boolean isAppend);
}
