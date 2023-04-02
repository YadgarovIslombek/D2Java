package lesson23.inheretanceTask;

public class Triangle extends Figura {
    private double c;


    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double getArea() {
        double d = (getA() + getB() + c) /2;
        double s = Math.sqrt(d*(d-getA())*(d-getB())*(d-c));
        return s;
    }
}
