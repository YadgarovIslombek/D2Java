package lesson23.inheretanceTask;

public abstract class Figura {
    private double a;
    private double b;

    public Figura(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double getArea();

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
