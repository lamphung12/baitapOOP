package QLTKNganHang;

import java.util.ArrayList;

public class QLAccount {
    ArrayList<Account> accountArrayList = new ArrayList<>();

    public void addTK(Account acc){
        this.accountArrayList.add(acc);
    }
    public void printTK(){
        for (int i = 0; i < accountArrayList.size(); i++) {
            System.out.println(accountArrayList.get(i));
        }
    }
//    public int searchTK(String name) {
//        for (int i = 0; i < accountArrayList.size(); i++) {
//            if(accountArrayList.get(i).getTenTK().equals(name)){
//                return i;
//            }
//
//        }
//        return -1;
//
//    }
    public int searchTK(String name) {
        for (int i = 0; i < accountArrayList.size(); i++) {
            if(accountArrayList.get(i).getTenTK().equals(name)){
                System.out.println(accountArrayList.get(i));
            }
        }
        return 0;
    }
    public void napTien(String nameTK){
        int TKCanNap = searchTK(nameTK);
        if(TKCanNap == -1){
            System.out.println("Khong co tai khoan nay !");
        }else {


        }
    }
//    public double rutTien(String nameTK){
//      double TKCanRut = searchTK(nameTK) ;
//      if(TKCanRut==-1){
//          System.out.println("");
//      }
//        return 0;
//    }

}
