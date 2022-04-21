package Bai2;

public class Main {
    public static void main(String[] args) {
       QuanLy quanLy = new QuanLy();
       quanLy.themTaiLieu(new TaiLieu(1,"Kim Dong",2));
        quanLy.themTaiLieu(new TaiLieu(1,"Kim Sach",3));
        quanLy.themTaiLieu(new Sach(2,"Kim Dong",2,"Lam",200));
        quanLy.themTaiLieu(new Bao(3,"Kim Dong",2,30));
        quanLy.themTaiLieu(new TapChi(4,"Kim Ma",2,111,12));
       quanLy.hienThi();


    }
}
