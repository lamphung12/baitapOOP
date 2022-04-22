package SVDaiHoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageStudent manageStudent=new ManageStudent();
        int choice=1;
        int type;
//////khai bao bien toan cuc////
        int id;
        String name;
        String address;
        int priority;
        ////// ----------- menu-------
        while (choice!=0) {
            System.out.println("--------------MENU-----------------");
            System.out.println("Vui long nhap lua chon");
            System.out.println("" +
                   "1. Thêm mới thí sinh.\n"+
                   "2. Hiện thị thông tin của thí sinh và khối thi của thí sinh.\n"+
                    "3.Tìm kiếm theo số báo danh.\n"+
                    "4.Thoát khỏi chương trình.\n"
            );
            choice = scanner.nextInt();
           switch (choice){
               case 1:
                   System.out.println("Chon 7 : Sinh vien khoi A");
                   System.out.println("Chon 8 : Sinh Vien khoi B");
                   System.out.println("Chon 9 : Sinh vien khoi C");

                   scanner.nextLine();
                   type=scanner.nextInt();
                    if(type==7) {
                        System.out.println("Nhap ten sinh vien");
                        name = scanner.nextLine();
                        scanner.nextLine();
                        System.out.println("Nhap dia chi sinh vien");
                        address = scanner.nextLine();
                        System.out.println("Nhap muc do uu tien");
                        priority = scanner.nextInt();
                        StudentsKhoiA studentsKhoiA = new StudentsKhoiA( name, address, priority);
                        manageStudent.add(studentsKhoiA);
                    }
                     if(type==8) {
                         System.out.println("Nhap ten sinh vien");
                         name = scanner.nextLine();
                         scanner.nextLine();
                         System.out.println("Nhap dia chi sinh vien");
                         address = scanner.nextLine();
                         System.out.println("Nhap muc do uu tien");
                         priority = scanner.nextInt();
                         StudentKhoiB studentKhoiB = new StudentKhoiB( name, address, priority);
                         manageStudent.add(studentKhoiB);
                     }
                     if(type==9) {

                         scanner.nextLine();
                         System.out.println("Nhap ten sinh vien");
                         name = scanner.nextLine();
                         scanner.nextLine();
                         System.out.println("Nhap dia chi sinh vien");
                         address = scanner.nextLine();
                         System.out.println("Nhap muc do uu tien");
                         priority = scanner.nextInt();
                         StudentKhoiC studentKhoiC = new StudentKhoiC( name, address, priority);
                         manageStudent.add(studentKhoiC);
                     }
               case 2:
                   manageStudent.display();
                   break;
               case 3:
                   System.out.println("Nhap id can tim kiem");
                   id=scanner.nextInt();
                   manageStudent.findById(id);
               case 4:
                   manageStudent.exit();
           }

        }

    }



}
