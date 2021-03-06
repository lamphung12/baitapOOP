package QuanLySinhVien;

import java.util.*;

public class DanhSachSinhVien implements Interface<Interface> {

    private ArrayList<SinhVien> danhSach;


    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<>();
    }

    public void themSinhVien(SinhVien sv) {
        this.danhSach.add(sv);
    }

    public void inDanhSachSV() {
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println(danhSach.get(i));
        }
    }

    public boolean kTraDanhSach() {
        return this.danhSach.isEmpty();
    }

    public void xoaPhanTu() {
        this.danhSach.remove(1);
    }

    public void sapXepTuoi(){
        Collections.sort(danhSach,new Comparator<SinhVien>(){

            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getNamSinh() - o2.getNamSinh();
            }
        });


    }
    public void findByName(String name) {

    }

    @Override
    public int finByName(String name) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getHoVaTen().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void delete(String name) {
        int viTriSinhVien = finByName(name);
        if (viTriSinhVien == -1) {
            System.out.println("Khong co ten sv nay !");
        } else {
           danhSach.remove(viTriSinhVien);
        }
    }

    @Override
    public void edid(Interface sinhVienT) {

    }
}
