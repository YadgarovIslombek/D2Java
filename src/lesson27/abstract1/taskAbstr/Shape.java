package lesson27.abstract1.taskAbstr;

public abstract class Shape {

    private double a;
    private double b;
    private double c;


    public abstract void peremetr();
    public abstract void yuzasi();

    public Shape(double a) {
        this.a = a;
    }

    public Shape(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
