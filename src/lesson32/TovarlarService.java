package lesson32;

public interface TovarlarService {
    void qoshish();
    void ochirish(int id);
    void barchaRoyhat();
    void ozgartirish(int id,String name);
    void ozgartirishAll(int id,String name,double price, int count);
    void qidirish(String name);

}
