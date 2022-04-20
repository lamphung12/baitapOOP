package QuanLySanPham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLySP implements SpInterface<SanPham>{
    private ArrayList<SanPham> danhSachSp;

    public QuanLySP() {
        this.danhSachSp = new ArrayList<>();
    }

    public QuanLySP(ArrayList<SanPham> danhSachSp) {
        this.danhSachSp = danhSachSp;
    }

    @Override
    public void themSP(SanPham Sp) {
        this.danhSachSp.add(Sp);
    }

    @Override
    public void suaSp() {
        danhSachSp.set(0,new SanPham("k30pp",200,10));
        for (int i = 0; i < danhSachSp.size(); i++) {
            System.out.println(danhSachSp.get(i));
        }

    }

    @Override
    public void xoaSp(String name) {
         int viTriSP = timKiemSp(name);
        if (viTriSP == -1) {
            System.out.println("Khong co ten  nay !");
        } else {
           danhSachSp.remove(viTriSP);
        }
    }

    @Override
    public int timKiemSp(String name) {
        for (int i = 0; i <danhSachSp.size() ; i++) {
            if(danhSachSp.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void inSp() {
        for (int i = 0; i <danhSachSp.size() ; i++) {
            System.out.println(danhSachSp.get(i));
        }

    }
    public boolean ktraDSRong(){
       return this.danhSachSp.isEmpty();
    }
    @Override
    public void sapXepGiamDan() {
        Collections.sort(danhSachSp, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
    }

    @Override
    public void sapXepTangDan() {
      Collections.sort(danhSachSp, new Comparator<SanPham>() {
          @Override
          public int compare(SanPham o1, SanPham o2) {
              return o1.getQuantity()-o2.getQuantity();
          }
      });
    }
    public void sapXepTheoTen(){
        Collections.sort(danhSachSp, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
    public int SPSoLuongMax(){
        int max = danhSachSp.get(0).getQuantity();
        for (int i = 0; i <danhSachSp.size() ; i++) {
            if(danhSachSp.get(i).getQuantity()>max){
                   max=danhSachSp.get(i).getQuantity();
            }
        }
        return max;
    }
}
