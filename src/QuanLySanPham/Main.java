package QuanLySanPham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySP dssp = new QuanLySP();
        int luachon =1;
          while (luachon!=0) {
              System.out.println("MENU-------------");
              System.out.println("Vui long nhap lua chon !");
              System.out.println(
                      "1. Nhap danh sach san pham tu ban phim\n."
                              + "2. In ra danh sach san pham\n."
                              + "3. Kiem tra xem danh sach san pham co rong khong\n."
                              + "4. Sap xep giam dan ve gia va in ra man hinh\n."
                              + "5. Tim san pham theo ten va in ra vi tri san pham\n."
                              + "6. Xoa san pham theo ten nhap tu ban phim vua tim duoc\n."
                              + "7. Sap xep theo ten\n."
                              + "8. Sua san pham dau tien \n."
                              + "9. Sap xep san pham theo so luong tu it nhat den nhieu nhat\n."
                              + "10. Tim san pham co so luong nhieu nhat\n."
              );
              luachon = sc.nextInt();
              sc.nextLine();
              if (luachon == 1) {
                  System.out.println("Nhap ten san pham");
                  String name = sc.nextLine();
                  System.out.println("Nhap gia san pham");
                  double price = sc.nextDouble();
                  System.out.println("Nhap so luong san pham");
                  int quantity = sc.nextInt();

                  SanPham sp = new SanPham(name,price,quantity);
                  dssp.themSP(sp);
                  System.out.println(sp.toString());

              } else if (luachon == 2) {
                       dssp.inSp();
                        System.out.println(dssp);

              } else if (luachon == 3) {
                  dssp.ktraDSRong();
                  System.out.println(dssp);

              } else if (luachon == 4) {
                   dssp.sapXepGiamDan();
                  System.out.println(dssp);

              } else if (luachon == 5) {
                  System.out.println("Nhap ten san pham can tim kiem");
                  String tenSp = sc.nextLine();
                  dssp.timKiemSp(tenSp);
                  System.out.println(dssp);

              } else if (luachon == 6) {
                  System.out.println("Nhap ten san pham can tim va xoa");
                  String nameSP=sc.nextLine();
                  dssp.xoaSp(nameSP);
                  System.out.println(dssp);

              } else if (luachon == 7) {
                  dssp.sapXepTheoTen();
                  System.out.println(dssp);

              } else if (luachon == 8) {
                  dssp.suaSp();
                  System.out.println(dssp);

              } else if (luachon == 9) {
                   dssp.sapXepTangDan();
                  System.out.println(dssp);

              } else if (luachon == 10) {
                  System.out.println("San pham co so luong lon nhat: " + dssp.SPSoLuongMax());
              }
          }
    }
}
