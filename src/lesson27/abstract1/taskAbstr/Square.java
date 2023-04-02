package lesson27.abstract1.taskAbstr;

public class Square extends Shape {

    public Square(double a) {
        super(a);
    }

    @Override
    public void peremetr() {
        System.out.println(4*getA());
    }

    @Override
    public void yuzasi() {
        System.out.println(getA()*getA());
    }
}
