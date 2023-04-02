package lesson24.polymorohism;

public class Person {
    private String name;
    private int age;


    public void ishla(){
        System.out.println("Ishlayapman");
    }

    public void ishla(int a){ //overload
        System.out.println(a + "marta" +"Ishlayapman");
    }
    public void ishla(int a,int b){ //overload
        System.out.println(a + "marta" +"Ishlayapman");
    }
    public void ishla(String a,int b){ //overload
        System.out.println(a + "marta" +"Ishlayapman");
    }

}
