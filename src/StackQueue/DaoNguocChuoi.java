package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc =new Scanner(System.in);

        System.out.println("NHap vao chuoi");
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
           stack.push(s.charAt(i)+"");
        }

        System.out.println("Dao nguoc chuoi");
        for(int i=0;i<s.length();i++){
            System.out.print(stack.pop());
        }
    }
}
