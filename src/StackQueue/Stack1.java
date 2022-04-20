package StackQueue;

import java.util.LinkedList;

public class Stack1 < T> {
    private LinkedList<T> stack;

    public Stack1(LinkedList<T> stack) {
        this.stack = stack;
    }

    public Stack1() {
        stack = new LinkedList<>();
    }
    public void push(T t){
        stack.addFirst(t);
    }
    public T top(){
        if(stack.isEmpty()){
        }
        return stack.removeFirst();
    }



}
