package lesson29;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        TovarlarServiceImpl ts = new TovarlarServiceImpl();
        Scanner sc = new Scanner(System.in);

        boolean b = true;
        while (b) {
            System.out.println("1->Add\n2->Delete\n3->AllList\n4->O'zgartirish\n5->Exit");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    ts.qoshish();
                    break;
                case 2:
                    System.out.println("Qaysi mahsulotni o'chirmoqchisiz \"id\" yuboring");
                    ts.barchaRoyhat();
                    int id = sc.nextInt();
                    ts.ochirish(id);
                    break;
                case 3:
                    ts.barchaRoyhat();
                    break;
                case 4:
                    System.out.println("Ozgartirmoqchi bo'lgan \"id\" ni yuboring");
                    ts.barchaRoyhat();
                    int id1 = sc.nextInt();
                    ts.ozgartirish(id1);
                    break;
                case 5:
                    b=false;
                default:
                    System.out.println("Xatolik");
            }
        }
    }
}
