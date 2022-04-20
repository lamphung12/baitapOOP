package QuanLySinhVien;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv =new DanhSachSinhVien();
        int luachon=-1;

        while (luachon!=0) {

            System.out.println("MENU -----------");
            System.out.println("Vui long nhap lua chon !");
            System.out.println(
                    "1. Them sinh vien vao danh sach.\n"
                            + "2.In danh sach sinh vien ra man hinh.\n"
                            + "3. Kiem tra xem danh sach sinh vien co rong khong'\n"
                            + "4.Xoa phan tu tai vi tri 1 \n."
                            + "5.Sap xep theo tuoi cua sinh vien tu lon toi nho\n"
                            + "6.Tim ten sinh vien xem co ko neu co o vi tri nao\n."
                            + "7.Xoa ten sinh vien neu tim duoc\n."
                            + "0.Thoat khoi chuong trinh.\n");
            luachon = sc.nextInt();
            sc.nextLine();

            if (luachon == 1) {
                System.out.println("Nhap ma sinh vien");
                String maSinhVien = sc.nextLine().toLowerCase(Locale.ROOT);
                System.out.println("Nhap ho va ten");
                String hoVaTen = sc.nextLine();
                System.out.println("Nhap nam sinh");
                int namSinh = sc.nextInt();
                System.out.println("Nhap diem trung binh");
                float diemTrungBinh = sc.nextFloat();

                SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                dssv.themSinhVien(sv);
                System.out.println(sv.toString());

            } else if (luachon == 2) {
                dssv.inDanhSachSV();
                System.out.println(dssv);

            } else if (luachon == 3) {
                dssv.kTraDanhSach();
                System.out.println(dssv);
            } else if(luachon == 4){
                dssv.xoaPhanTu();
                System.out.println(dssv);
            }else if(luachon == 5){
                 dssv.sapXepTuoi();
                System.out.println(dssv);

            }else if(luachon == 6){
                System.out.println("Nhap  vao ten sinh vien can tim kiem");
                String tenSV = sc.nextLine();
                dssv.finByName(tenSV);
                System.out.println(dssv.finByName(tenSV));

            }else if(luachon==7){
                System.out.println("Nhap ten sinh vien can tim va xoa");
                String name=sc.nextLine();
                dssv.delete(name);
                System.out.println(dssv);
            }
        }

    }
}
