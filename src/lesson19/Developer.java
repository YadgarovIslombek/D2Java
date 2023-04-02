package lesson19;

public class Developer {
    String name = "Islombek";
    String gender;
    int age;
    int salary;
    String type;

    public Developer(String name, String gender,int age,int salary,String type){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.type = type;

    }

    public Developer(String name, String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //default cons
    public Developer(){

    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", type='" + type + '\'' +
                '}';
    }
}
