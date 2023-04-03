package lesson38.jsongson;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Geo g = new Geo("100.15151","115.22");
        Address address = new Address("Mevazor","Urgench","200100",g);
        Person p = new Person(1,"Islombek","islombek@mail.com",address,"+99899357","islombek.com");

        Gson gson = new Gson();
        String s = gson.toJson(p);
        System.out.println(s);

    }
}
