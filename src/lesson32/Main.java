package lesson32;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        TovarlarServiceImpl ts = new TovarlarServiceImpl();
        Scanner sc = new Scanner(System.in);

        boolean b = true;
        while (b) {
            System.out.println("1->Add\n2->Delete\n3->AllList\n4->O'zgartirish\n5->O'zgartirishAll\n6->qidirish\n7->Exit");
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
                    System.out.println("Nomini yuboring");
                    ts.ozgartirish(id1,sc.next());
                    break;
                case 5:

                    System.out.println("Ozgartirmoqchi bo'lgan tovarning \"id\"sini yuboring");
                    ts.barchaRoyhat();
                    int id2 = sc.nextInt();

                    System.out.println("Tovar nomini kiriting");
                    String name = sc.next();
                    System.out.println("Tovar narxi kiriting");
                    double price = sc.nextDouble();
                    System.out.println("Tovar sonini kiriting");
                    int count = sc.nextInt();
                    ts.ozgartirishAll(id2,name,price,count);
                    break;
                case 6:

                    System.out.println("Mahsulot nomini kiriting");
                    String tovarName = sc.next();
                    ts.qidirish(tovarName);
                    break;
                case 7:
                    b=false;
                default:
                    System.out.println("Xatolik");
            }
        }
    }
}
