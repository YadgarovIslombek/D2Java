package lesson36;

public class User {

    public void checkAge(int age){
        if (age>=16){
            System.out.println("Pasport olishingiz mumkin");
        }else {
            throw new PassportExeption("Siz hali passport yoshida emassiz");
        }
    }
}
