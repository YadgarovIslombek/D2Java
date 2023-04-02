package lesson34.dictionary;

import lesson34.dictionary.service.DictionaryImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DictionaryImpl d = new DictionaryImpl();
        boolean b = true;
        int a = 0;
        System.out.println("1->So'z qo'shish 2-> Tarjima ko'rish 3->Sinonim qo'shish 4->Barcha Lugat");
        try {
            a = sc.nextInt();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("sdsdsd");
            switch (a) {
                case 1 -> d.addWord();
                case 2 -> d.showTranslate();
                case 3 -> d.addSinonim();
                case 4 -> d.allList();
            }
        }
    }
}
