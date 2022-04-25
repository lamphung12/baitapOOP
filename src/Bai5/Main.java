package Bai5;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ManageHotel manageHotel = new ManageHotel();
        manageHotel.add(new Person("aa",1,new ROOM_A(),2));

        int choice =1;
        while (choice!=0){
            System.out.println("Ung dung quan ly khach san ");
            System.out.println(" Chon 1: Them thong tin khach hang");
            System.out.println(" Chon 2: Hien thi thong tin khach hang");
            System.out.println(" Chon 3: Tinh gia thue phong ");
            System.out.println(" Chon 4: Xoa thong ti khach hang");
            System.out.println(" Chon 5: Thoat khoi chuong trinh");
            System.out.println(" Chon 6: Tim kiem khach hang theo id");


            choice= sc.nextInt();
               switch (choice){
                   case 1:
                       System.out.println("Nhap ten khach hang");
                       sc.nextLine();
                       String name = sc.nextLine();
                       System.out.println("Nhap tuoi");
                       int age = sc.nextInt();
                       System.out.println("Nhap so ngay thue phong");
                       int numberRent = sc.nextInt();
                   //  ===============Chon loai phong=================

                       System.out.println("Nhap loai phong thue");
                       System.out.println("Chon a: Chon phong loai A");
                       System.out.println("Chon b: Chon phong loai B");
                       System.out.println("Chon c: Chon phong loai C");

                       sc.nextLine();
                       String chon = sc.nextLine();
                       Room room = new Room();
                       if(chon.equals("a")){
                           room=new ROOM_A();
                           System.out.println(room.toString());
                       }else if(chon.equals("b")){
                           room = new ROOM_B();
                           System.out.println(room.toString());
                       }else if(chon.equals("c")){
                           room = new ROOM_C();
                           System.out.println(room.toString());
                       }else{
                           System.out.println("Vui long chon lai");
                       }
                      Person person =new Person(name,age,room,numberRent);
                       manageHotel.add(person);
                       sc.nextLine();
                       break;

                   case 2:
                       manageHotel.display();
                       break;
                   case 3:
                       System.out.println("Nhap id khach hang can thanh toan ");
                       int id2 = sc.nextInt();
                       System.out.println("So tien can thah toan : "+ manageHotel.tinhGiaTien(id2));
                     break;
                   case 4:
                       System.out.println("Nhap id khach hang can xoa");
                       int id1= sc.nextInt();
                      manageHotel.delete(id1);
                     break;
                   case 5:
                       manageHotel.exit();
                      break;
                   case 6:
                       System.out.println("Nhap id khach can tim");
                       int id = sc.nextInt();
                       System.out.println( manageHotel.search(id));
               }
        }
    }
}
