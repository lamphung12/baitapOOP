package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public record DaoNguocSoNguyen() {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap so phan tu trong mang");
        int n=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.println("Nhap phan tu muon them:"+i+ ":");
            int e = sc.nextInt();
            stack.push(e);
        }
        System.out.println("Mang vua nhap: ");
        for (int i = 0; i <n ; i++) {

        }


    }
}
