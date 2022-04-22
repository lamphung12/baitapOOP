package QuanLyTinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyNguoi quanLyNguoi = new QuanLyNguoi();
        QuanLyTinh quanLyTinh = new QuanLyTinh();

        int choice = 1;

        while (choice != 0) {
            System.out.println("--------------MENU-----------------");
            System.out.println("Vui long nhap lua chon");
            System.out.println("" +
                    "1. Thêm nguoi\n" +
                    "2. Hiện thị thông tin nguoi.\n" +
                    "3.Hien thi so tinh va so luong nguoi trong danh sach.\n"

            );
             switch (choice) {
                 case 1:
                     System.out.println("Nhap ma nguoi");
                     int ma = scanner.nextInt();
                     System.out.println("Nhap ten ");
                     String name = scanner.nextLine();
                     scanner.nextLine();
                     System.out.println("Nhap tuoi");
                     int age = scanner.nextInt();
                     boolean check = true;
                     do {
                         System.out.println("Nhap tinh");
                         String nhapTinh = scanner.nextLine();
                         for (Tinh t : quanLyTinh.getArrayList()) {
                             if (t.getName().equals(nhapTinh)) {
                                 Nguoi nguoi = new Nguoi(t.getMaTinh(), t.getName(), t.getDanSo(), t.getGDP(), ma, name, age);
                                 quanLyNguoi.add(nguoi);
                                 check = true;
                                 System.out.println(nguoi.toString());
                                 break;
                             }
                             check = false;
                         }
                     }while (check == false) ;













             }

        }
    }


}
