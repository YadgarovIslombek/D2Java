package lesson18.OOP;

public class Main {
    public static void main(String[] args) {
        AirConditioner artel = new AirConditioner();
        artel.name = "Artel";
        artel.bahosi = 300;
        artel.yili = 2023;
        artel.show();
        artel.issiqOn();


        AirConditioner samsung = new AirConditioner();
        samsung.name = "samsung";
        samsung.bahosi = 500;
        samsung.yili = 2023;
        samsung.show();
        samsung.sovuqOn();




    }
}
