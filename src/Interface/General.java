package Interface;

public interface General<T>{
    void add(T t);
    void search(int id);
    void edit(int id, T t);
    void delete();
    void display();
    void exit();

}
