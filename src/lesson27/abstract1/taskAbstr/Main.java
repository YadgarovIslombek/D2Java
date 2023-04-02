package lesson27.abstract1.taskAbstr;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(15);
        c.peremetr();
        c.yuzasi();
        Rectangle r = new Rectangle(10,15);
        r.peremetr();
        r.yuzasi();
        Triangle t = new Triangle(5,8,4);
        t.peremetr();
        t.yuzasi();
        Square s = new Square(15);
        s.peremetr();
        s.yuzasi();

    }
}
