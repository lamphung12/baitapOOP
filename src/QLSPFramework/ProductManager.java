package QLSPFramework;

import java.util.ArrayList;

public class ProductManager implements Interface<Product> {
    private ArrayList<Product> productArrayList = new ArrayList<>();

    public ProductManager() {
    }

    public ProductManager(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    @Override
    public void add(Product product) {
    productArrayList.add(product);
    }

    @Override
    public void edit(int id,Product product) {
        productArrayList.set(0,new Product(123,"dienThoai",2000));
        for (int i = 0; i < productArrayList.size() ; i++) {
            System.out.println(productArrayList.get(i));
        }
    }

    @Override
    public void delete(int id) {
        int viTriCanXoa = search(id);
        if(viTriCanXoa==-1){
            System.out.println("Khong co id can tim");
        }else{
            productArrayList.remove(viTriCanXoa);
        }
    }

    @Override
    public void display() {
        for (int i = 0; i <productArrayList.size() ; i++) {
            System.out.println(productArrayList.get(i));
        }
        System.out.println("---------------------");
    }

    @Override
    public int searchSP(String name) {
        for (int i = 0; i <productArrayList.size() ; i++) {
            if(productArrayList.get(i).getName().equals(name)){
                return i;
            }
        }
        return 0;
    }
    public int search(int id){
        for (int i = 0; i <productArrayList.size() ; i++) {
            if(productArrayList.get(i).getId()==id){
                return i;
            }
        }
        return 0;
    }
}
