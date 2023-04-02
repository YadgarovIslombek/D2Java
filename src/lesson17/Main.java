package lesson17;
public class Main {
    public static void main(String[] args) {
        double d  = Main.myMax(222,21);
        System.out.println(d);
    }
    static double myMax(int a,int b){
        return Math.max(a,b);
    }
}
