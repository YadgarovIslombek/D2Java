package lesson12;

public class Main1 {
    public static void main(String[] args) {
        Main1.showString(7,8);
        int a = Main1.MinMax(60,60);
        if (a == 0){
            System.out.println("sonlar teng");
        }else {

        System.out.println(a + " katta");
        }
    }
    static void showString(int a, int b){
        System.out.println(a + b);
    }

    static int MinMax(int a,int b){
        //int katta = 0;
        if (a>b){
            return a;

        } else if (a == b) {
          return 0;

        } else {
            return b;
        }

    }




}
