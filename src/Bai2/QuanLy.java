package Bai2;

import java.util.ArrayList;

public class QuanLy {
    ArrayList<TaiLieu> arrayList = new ArrayList<>();

    public void themTaiLieu(TaiLieu taiLieu){
        arrayList.add(taiLieu);

    }

    public void xoaTaiLieu(String  name){

    }

    public void hienThi(){
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("-----------------");
    }

    public void timKiem(int maTaiLieu){
        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i).getMaTaiLieu() == maTaiLieu ){
                System.out.println(  arrayList.get(i));
            }
        }

    }

    public void thoat(){

    }
}
