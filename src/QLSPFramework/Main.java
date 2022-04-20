package QLSPFramework;

public class Main {
    public static void main(String[] args) {
       ProductManager pro= new ProductManager();
       pro.add(new Product(10,"may tinh",1000));
       pro.add(new Product(15,"may cay",1600));
       pro.add(new Product(20,"may in",2000));
       pro.add(new Product(18,"may anh",1080));
       pro.display();
       pro.searchSP("may in");
       pro.delete(10);
       pro.display();
       pro.edit(10,new Product(123,"dienThoai",2000));
       pro.display();

    }
}
