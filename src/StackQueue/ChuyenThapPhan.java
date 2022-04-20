package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenThapPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> StackSoDu = new Stack<>();
        System.out.println("Nhap so can tim");
        int x = sc.nextInt();

        while (x > 0) {
         int soDu1 = x%2;
         StackSoDu.push(soDu1);
         x = x/2;
        }
        System.out.println("So nhi phan la: ");
        int n= StackSoDu.size();
        for (int i = 0; i <n ; i++) {
            System.out.println(StackSoDu.pop());
        }
    }
}