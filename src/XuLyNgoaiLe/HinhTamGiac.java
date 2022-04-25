package XuLyNgoaiLe;
import java.util.Scanner;

public class HinhTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a");
        int a = sc.nextInt();
        System.out.println("Nhap canh b");
        int b = sc.nextInt();
        System.out.println("Nhap canh c");
        int c = sc.nextInt();

        if ((a < 0 || b < 0 || c < 0) && ((a + b > c) || (a + c > b) || (b + c > a))) {
            try {
                throw new TamGiac();
            } catch (TamGiac e) {
                System.out.println(e);
            }
        }
    }
}
class TamGiac extends Exception{
    @Override
    public String toString() {
        return "Tam giac chua hop le";
    }
}