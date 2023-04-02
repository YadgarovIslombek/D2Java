package lesson37.libraryApp.service;

import lesson37.libraryApp.models.Book;

import java.util.List;
import java.util.Scanner;

public class BookServiceImpl implements BookService{
    Scanner sc = new Scanner(System.in);
    FileServiceImpl fileService = new FileServiceImpl();
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

        Book book = new Book(author,name,category,year,rating);
        String a = book.getAuthor() + "$" + book.getBookName() +
                "$" + book.getCategory() + "$" + book.getWriteYear() +
                "$" + book.getRating() + "\n";
        fileService.write(a,true);

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

    private void upgradeList(List<Book> bookList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Book book : bookList) {
            stringBuilder.append(book.getAuthor() + "$" + book.getBookName() + "$" + book.getCategory() + "$" + book.getWriteYear() + "$" + book.getRating());
        }
        String a = stringBuilder.toString();
        fileService.write(a,false);
    }
}
