package lesson15;

public class Main {
    public static void main(String[] args) {
        String s = makeOutWord("<<>>", "Yay");
        System.out.println(s);
    }


    static String makeOutWord(String out,String word){
        String boshlanish = out.substring(0,2); //<<
        String yakun = out.substring(2); //>>
        return boshlanish + word + yakun;
    }
}


