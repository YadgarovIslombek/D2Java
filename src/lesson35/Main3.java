package lesson35;

public class Main3 {
    public static void main(String[] args) {
       int a = 100;
       String a1 = "100b";
       try{
           System.out.println(a / Integer.parseInt(a1));
       }catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }finally {

        System.out.println("Bu catchdan keyin");
       }


    }
}
