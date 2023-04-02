package lesson21;

public class Person {
    private String name;
    private int age;

    private String work;

    private int salary;


    public Person(String name, int age, String work, int salary) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
    }

    public void show(){
        System.out.println("Ismi " + name);
        System.out.println("yoshi " + age);
        System.out.println("ishi " + work);
        System.out.println("oyligi " + salary);
    }

    public void calcSalary(int period){
        System.out.println(name +" nomli xodim " + period + " oy ichida " + period * salary + "$ dollar oylik oldi" );
    }

}
