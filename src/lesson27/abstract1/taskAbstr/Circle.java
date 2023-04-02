package lesson27.abstract1.taskAbstr;

public class Circle extends Shape{


    public Circle(double a) {
        super(a);
    }
    @Override
    public void peremetr() {
        System.out.println(2 + Math.PI * getA());
    }

    @Override
    public void yuzasi() {
        System.out.println(Math.PI*getA()*getA());

    }


}
