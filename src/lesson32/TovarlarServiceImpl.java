package lesson32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TovarlarServiceImpl implements TovarlarService {


    //Tovar[] tovars = new Tovar[100];
    List<Tovar> tovars = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int id = 0;

    @Override
    public void qoshish() {
        System.out.println("Tovar nomini kiriting: ");
        String nomi = sc.next();
        System.out.println("Narxini kiriting: ");
        double narx = sc.nextDouble();
        System.out.println("Sonini kiriting");
        int soni = sc.nextInt();
        Tovar t = new Tovar(id,nomi,narx,soni); //id = 1
        //tovars[id] = t;
        tovars.add(t);  // id = 1
        id++; //id = 2;
        System.out.println("Muffaqiyatli qo'shildi");
    }

    @Override
    public void ochirish(int id) {
//        for (int i = 0; i < this.id; i++) {
//            if (tovars[i].getId() == id){
//                tovars[i].setName("0");
//                tovars[i].setCount(0);
//                tovars[i].setPrice(0);
//            }
//        }
        tovars.remove(id);
        System.out.println("Muffaqiyatli o'chirildi");
    }

    @Override
    public void barchaRoyhat() {
        tovars.forEach(System.out::println);
    }

    @Override
    public void ozgartirish(int id,String name) {

        tovars.get(id).setName(name);


//        System.out.println("Tovar nomini kiriting: ");
//        String nomi = sc.next();
//        Tovar t = new Tovar(this.id,nomi);
//        tovars[id] = t;
        System.out.println("Muffaqiyatli o'zgartirildi");
    }

    @Override
    public void ozgartirishAll(int id, String name, double price, int count) {
        Tovar t = new Tovar(id,name,price,count);
        tovars.set(id,t);
        System.out.println("Muffaqiyatli o'zgartirildi");
    }

    @Override
    public void qidirish(String name) {
        for (int i = 0; i < tovars.size(); i++) {
            if (tovars.get(i).getName().equalsIgnoreCase(name)){
                System.out.println(tovars.get(i).getId());
            }else {
                System.out.println("Mahsulot topilmadi");
            }
        }
    }
}
