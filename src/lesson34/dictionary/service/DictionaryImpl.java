package lesson34.dictionary.service;

import lesson34.dictionary.models.Dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DictionaryImpl implements DictionaryService {
    private Scanner sc = new Scanner(System.in);
    private Map<String, Dictionary> map  =  new HashMap<>();
    @Override
    public void addWord() {
        System.out.println("So'z kiriting");
        String s = sc.next(); //hello
        System.out.println("Tarjimasini kiriting");
        String s1 = sc.next(); //salom
        Dictionary d = new Dictionary(s1);
        System.out.println(d);
        map.put(s,d);
    }
    @Override
    public void showTranslate() {
        System.out.println("Qaysi so'zni tarjimasini ko'rmoqchisiz yozing!");
        String s1 = null;
        try {
            s1 = sc.next();

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        if (map.containsKey(s1)) {
            Dictionary d = map.get(s1);

            System.out.println(d);
        } else {
            System.out.println("So'z topilmadi");
        }
    }

    @Override
    public void addSinonim() {
        System.out.println("Qaysi so'zni sinonimini qiritmoqchisiz?");
        String c = sc.next();
        if (map.containsKey(c)){
            Dictionary m = map.get(c);
            System.out.println("Sinonim qiriting: ");
            String g = sc.next();
            m.getSinonim().add(g);
        }else {
            System.out.println("Bunday so'z yo'q");
        }
    }

    @Override
    public void editTranslate() {
        System.out.println("Qaysi tarjimani o'zgartirmoqchisiz?");
        String s1 = sc.next();
        if (map.containsKey(s1)){
            Dictionary d = map.get(s1);
            System.out.println("Yangi tarjima kriiting");
            String tar = sc.next();
            d.setTarjima(tar);
        }else {
            System.out.println("So'z topilmadi");
        }

    }

    @Override
    public void allList() {
        Set<Map.Entry<String, Dictionary>> entries = map.entrySet();
        for (Map.Entry<String, Dictionary> entry : entries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }


    @Override
    public void removeTranslate() {
        System.out.println("Qaysi so'zni o'chirmoqchisiz");
        String s1 = sc.next();
        if (map.containsKey(s1)){
//            Dictionary d = map.get(s1);
//
//            d.setTarjima(null);
            map.remove(s1);
        }else {
            System.out.println("So'z topilmadi");
        }
    }
}
