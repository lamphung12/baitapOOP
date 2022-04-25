package XuLyNgoaiLe;



import java.util.Scanner;

public class TinhToan {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap gia tri x");
        int x= sc.nextInt();
        System.out.println("Nhap gia tri y");
        int y= sc.nextInt();
        TinhToan tinhToan = new TinhToan();
        tinhToan.pheptinh(x,y);
    }

    private void pheptinh(int x, int y) {
        try {
            int a = x+y;
            int b = x-y;
            int c = x/y;
            int d = x*y;
            System.out.println("Tong : "+ a);
            System.out.println("Hieu : "+ b);
            System.out.println("Nhan : "+ d);
            System.out.println("Chia : "+ c);
        } catch (Exception e){
            System.out.println("Xay ra ngoai le: " );
        }



    }
}
