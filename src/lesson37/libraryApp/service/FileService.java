package lesson37.libraryApp.service;

import lesson37.libraryApp.models.Book;

import java.util.List;

public interface FileService {
    List<Book> getBookList();
    void write(String name, boolean isAppend);
}
