package QLTKNganHang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        QLAccount qla =new QLAccount();
       int choice=1;
       while (choice!=0){
           System.out.println("--------------MENU-----------------");
           System.out.println("Vui long nhap lua chon");
           System.out.println("" +
                   "1.Nhap thong tin cua khach hang\n"+
                   "2.Xuat ra danh sach thong tin cua khach hang\n"+
                   "3.Tim kiem thong tin tai khoan\n"+
                   "4.Nap tien\n"+
                   "5.Rut tien\n"
           );
           choice=sc.nextInt();

           if(choice==1){
               System.out.println("Nhap so tai khoan");
                int STK = sc.nextInt();
               System.out.println("Nhap ten tai khoan");
               sc.nextLine();
               String TenTK = sc.nextLine();

               System.out.println("Nhap so tien trong tai khoan");
               int SoTienTrongTK = sc.nextInt();

               Account acc= new Account(STK,TenTK,SoTienTrongTK);

               qla.addTK(acc);
               System.out.println(acc.toString());

           }else
           if(choice==2){
               qla.printTK();
               System.out.println(qla);
           }
           else if(choice==3){
               System.out.println("Nhap ten tai khoan can tim");
                sc.nextLine();
               String nameTTK = sc.nextLine();
               qla.searchTK(nameTTK);
               System.out.println(qla);

           }else if(choice==4){


           } else if(choice==5){
//               System.out.println(qla.rutTien());
           }
       }
    }
}
