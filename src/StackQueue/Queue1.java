package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> aa = new LinkedList<String>();
        aa.add("lam");
        aa.add("lam1");
        aa.add("lam2");
        while (!aa.isEmpty()){
            String aaa= aa.poll();
            System.out.println(aaa);
        }


    }
}
