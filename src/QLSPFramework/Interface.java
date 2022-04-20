package QLSPFramework;

public interface Interface <T>{
    void add(T t);
    void edit(int id, T t);
    void delete(int id);
    void display();
    int searchSP(String name);
}
