package lesson37.libraryApp;

import lesson37.libraryApp.models.Book;
import lesson37.libraryApp.service.BookServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookServiceImpl bookService = new BookServiceImpl();
        System.out.println("Kutubxonamizga xush kelibsiz");
        while (true){
            System.out.println("1-> Kitob qo'shish 2-> Barcha kitoblar 3-> O'chirish");
            int a = sc.nextInt();
            switch (a){
                case 1-> bookService.add();
                case 2-> bookService.allList();
                case 3-> bookService.delete();
            }
        }
    }
}
