package Bai5;

public interface General <T>{
    void add(T t);
    int search(int id);
    void edit(int id, T t);
   void delete(int id);
    void display();
    void exit();

}
