package lesson29;

import java.util.Scanner;

public class TovarlarServiceImpl implements TovarlarService {


    Tovar[] tovars = new Tovar[100];
    Scanner sc = new Scanner(System.in);
    int oshibBoruvchiQiymat = 0;

    @Override
    public void qoshish() {
        System.out.println("Tovar nomini kiriting: ");
        String nomi = sc.next();
        System.out.println("Narxini kiriting: ");
        double narx = sc.nextDouble();
        System.out.println("Sonini kiriting");
        int soni = sc.nextInt();
        Tovar t = new Tovar(oshibBoruvchiQiymat,nomi,narx,soni);
        tovars[oshibBoruvchiQiymat] = t;
        oshibBoruvchiQiymat++;
        System.out.println("Muffaqiyatli qo'shildi");
    }

    @Override
    public void ochirish(int id) {
        for (int i = 0; i < oshibBoruvchiQiymat; i++) {
            if (tovars[i].getId() == id){
                tovars[i].setName("0");
                tovars[i].setCount(0);
                tovars[i].setPrice(0);
            }
        }
        System.out.println("Muffaqiyatli o'chirildi");
    }

    @Override
    public void barchaRoyhat() {
        for (int i = 0; i < oshibBoruvchiQiymat; i++) {
            System.out.println(tovars[i]);
        }
    }

    @Override
    public void ozgartirish(int id) {
        System.out.println("Tovar nomini kiriting: ");
        String nomi = sc.next();
        Tovar t = new Tovar(oshibBoruvchiQiymat,nomi);
        tovars[id] = t;
        System.out.println("Muffaqiyatli o'zgartirildi");
    }
}
