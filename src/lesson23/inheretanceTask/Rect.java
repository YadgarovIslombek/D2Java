package lesson23.inheretanceTask;

public class Rect extends Figura{
    public Rect(double a, double b) {
        super(a, b);
    }

    public Rect() {
        super(0,0);
    }

    @Override
    public double getArea() {
        return getA() * getB();
    }
}
