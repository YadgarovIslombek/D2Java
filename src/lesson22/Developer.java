package lesson22;
public class Developer extends Person {
    //subClass
    private int salary;
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    Object b = false;
    @Override
    public String toString() {
        return "Developer{" +
                "salary=" + salary +
                '}';
    }
    @Override   //anotatsiya
    public void show() {
        System.out.println("ismi " + getName());
        System.out.println("yoshi " + getAge());
        System.out.println("ishi " + getWork());
        System.out.println("oyligi " + salary);
    }
}
