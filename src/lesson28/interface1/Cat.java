package lesson28.interface1;

public class Cat extends Wolf implements Animal,ToDo{

    @Override
    public void voice(String a) {
        System.out.println("Meow");
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
