package XuLyNgoaiLe;

import java.util.Scanner;

public class DeMobUG {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String menu = """
                ========menu======== |
                1.Hien thi           |
                2.Them               |
                3.Sua                |
                4.Xoa
                5.Thoat                             
                """;
        boolean check =false;
        while (check=true){
            System.out.println(menu);
            System.out.println("Moi nhap lua chon");
        }
        try {
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("");
            }
        }catch (Exception e){
            System.out.println("Nam ngoai khoang");
            check = true;
        }
    }
}
