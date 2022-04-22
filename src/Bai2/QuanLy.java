package Bai2;

import java.util.ArrayList;

public class QuanLy {
    ArrayList<TaiLieu> arrayList = new ArrayList<>();

    public QuanLy() {
        arrayList.add(new TaiLieu("Kim Dong",111));
        arrayList.add(new TaiLieu("Kim Ma",123));
        arrayList.add(new Sach("Kim Ma",123,"GF",100));
        arrayList.add(new Sach("Kim Ma",123,"Gt",200));
        arrayList.add(new Bao("Kim Dong",111,31));
        arrayList.add(new Bao("Kim Dong",121,30));

    }

    public void themTaiLieu(TaiLieu taiLieu){
        arrayList.add(taiLieu);

    }

    public void xoaTaiLieu(int maTaiLieu){


    }
    public void hienThiSach(){
        for (TaiLieu t:arrayList) {
            if(t instanceof Sach){
                System.out.println(t);
            }
        }
    }
    public void hienThiBao(){
        for (TaiLieu t:arrayList) {
            if(t instanceof Bao){
                System.out.println(t);
            }
        }
    }

    public void hienThi(){
        for (TaiLieu t:arrayList) {
            System.out.println(t);
            }
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
