package lesson18.OOP;

public class AirConditioner {
    //field(maydonlari)
    String name;
    int bahosi;

    int yili;




    //metodlari

    public void show(){
        System.out.println("Nomi " + name);
        System.out.println("Bahosi " + bahosi);
        System.out.println("Yili " + yili);
    }


    public void issiqOn(){
        System.out.println("Hot ON");
    }
    public void issiqOf(){
        System.out.println("Hot OFF");
    }

    public void sovuqOn(){
        System.out.println("Cold On");
    }
    public void sovuqOf(){
        System.out.println("Cold OFF");
    }
}
