package lesson19.registirationTask;

public class User {
    String name;
    String fname;

    int age;

    String email;

    String parol;

    public User(String name, String fname, int age, String email, String parol) {
        this.name = name;
        this.fname = fname;
        this.age = age;
        this.email = email;
        this.parol = parol;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", fname='" + fname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", parol='" + parol + '\'' +
                '}';
    }
}
