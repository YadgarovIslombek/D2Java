package lesson27.abstract1.taskAbstr;

public class Triangle extends Shape {
    public Triangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public void peremetr() {
        System.out.println(getA()+getB()+getC());

    }

    @Override
    public void yuzasi() {
        double p  = (getA()+getB()+getC())/2;
        System.out.println(Math.sqrt(p*(p-getA())*(p-getB())*(p-getC())));
    }
}
