package lesson23;

public class Main {
    public static void main(String[] args) {
        Address a = new Address("Uzbekistan","Xorazm","Urgench","Ikbol",23);
        User u = new User("Islombek",28,a);
        System.out.println(u);

    }
}
