package lesson20;

public class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher("Sabohat",25,"M");
        t.setAge(16);
        System.out.println(t.getAge());
        System.out.println(t);
    }
}
