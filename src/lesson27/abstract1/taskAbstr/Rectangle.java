package lesson27.abstract1.taskAbstr;

public class Rectangle extends Shape {

    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public void peremetr() {
        System.out.println(2 * (getA() + getB()));
    }

    @Override
    public void yuzasi() {
        System.out.println(getA()*getB());
    }
}
