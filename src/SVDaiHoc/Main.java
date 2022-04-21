package SVDaiHoc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageStudent manageStudent=new ManageStudent();
        int choice=1;
        while (choice!=0) {
            System.out.println("--------------MENU-----------------");
            System.out.println("Vui long nhap lua chon");
            System.out.println("" +
                   "1. Thêm mới thí sinh.\n"+
                   "2. Hiện thị thông tin của thí sinh và khối thi của thí sinh.\n"+
                    "3.Tìm kiếm theo số báo danh.\n"+
                    "4.Thoát khỏi chương trình.\n"
            );
            choice = sc.nextInt();

            if(choice==1){
                System.out.println("Nhap so bao danh");
                int id = sc.nextInt();
                System.out.println("Nhap ho va ten");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Nhap dia chi");
                String address = sc.nextLine();
                System.out.println("Nhap muc do uu tien");
                int priority= sc.nextInt();

                Students students = new Students(id,name,address,priority);
                manageStudent.add(students);
                System.out.println(students.toString());
            }else if(choice==2){
                manageStudent.display();
                System.out.println(manageStudent);
            }

        }
    }
}
