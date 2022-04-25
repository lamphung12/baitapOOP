package XuLyNgoaiLe;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndex {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach cua mang");
        for (int i = 0; i <100 ; i++) {
            arr[i] = rd.nextInt();
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayIndex arr = new ArrayIndex();
        Integer[] arr1 = arr.createRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Vui long nhap chi so 1 phan tu bat ky");
        int x = sc.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr1[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}


