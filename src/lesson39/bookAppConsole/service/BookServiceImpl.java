package lesson39.bookAppConsole.service;

import lesson39.bookAppConsole.models.Book;
import lesson39.bookAppConsole.models.Book1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookServiceImpl implements BookService {
    Scanner sc = new Scanner(System.in);
    FileServiceImpl fileService = new FileServiceImpl();
    Book1 book1 =new Book1();
    List<Book> list  = new ArrayList<>();
    @Override
    public void add() {
        System.out.print("Kitob muallifini kiriting: ");
        String author = sc.next();
        System.out.print("Kitob nomini kiriting: ");
        String name = sc.next();
        System.out.print("Kitob turini kiriting: ");
        String category = sc.next();
        System.out.print("Kitob qachon yozilgan: ");
        int year = sc.nextInt();
        System.out.print("Kitobning reyting: ");
        String rating = sc.next();
        list.add(new Book(author,name,category,year,rating));

        book1.setList(list);
        fileService.write(list,false);

//        Book book = new Book(author,name,category,year,rating);
//        String a = book.getAuthor() + "$" + book.getBookName() +
//                "$" + book.getCategory() + "$" + book.getWriteYear() +
//                "$" + book.getRating() + "\n";
//        fileService.write(a,true);

    }



    @Override
    public void allList() {
        List<Book> bookList = fileService.getBookList();

        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    @Override
    public void delete() {
        List<Book> bookList = fileService.getBookList();
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(i + 1 + "-> " +bookList.get(i).getBookName());
        }
        int a =sc.nextInt()-1;
        bookList.remove(a);
        upgradeList(bookList);

    }

    @Override
    public void sort() {

    }

    @Override
    public void search() {

    }

    private void upgradeList(List<Book> bookList) {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (Book book : bookList) {
//            stringBuilder.append(book.getAuthor() + "$" + book.getBookName() + "$" + book.getCategory() + "$" + book.getWriteYear() + "$" + book.getRating());
//        }
//        String a = stringBuilder.toString();
//        fileService.write(a,false);
    }
}
