package lesson13;

public class Main4 {
    public static void main(String[] args) {
        Main4.juftToq(-5);
    }
    static void juftToq(int a){
        //2%2=0   2/2 = 1  5/2 = 2.5  5 % 2 = 1
        if (a > 0){
            if (a % 2 == 0){
                System.out.println("Juft son");
            }else if(a == 0) {
                System.out.println("Nolga teng");

            } else {
                System.out.println("toq son");
            }
        }else {
            System.out.println("manfiy son");
        }

    }
}
