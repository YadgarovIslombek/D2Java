package lesson17;

public class Main5 {
    public static void main(String[] args) {
        int[] massiv = {1,2,3,4,5};

        int a = Main5.find(massiv,4);
        System.out.println(a);


        for(int i : massiv){ //foreach
            System.out.println(i);
        }

    }
    static int find(int[] a,int b) {
        return a[b];
    }
}
