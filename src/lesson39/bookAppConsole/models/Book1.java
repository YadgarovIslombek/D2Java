package lesson39.bookAppConsole.models;

import java.util.List;

public class Book1 {
    private List<Book> list;

    public Book1() {
    }

    public Book1(List<Book> list) {
        this.list = list;
    }

    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Book1{" +
                "list=" + list +
                '}';
    }
}
