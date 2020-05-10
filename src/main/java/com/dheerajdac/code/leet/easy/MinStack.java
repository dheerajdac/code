package com.dheerajdac.code.leet.easy;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> minStack;


    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int x) {
        stack.addLast(x);
        if(!minStack.isEmpty() && minStack.peekLast() >= x){
            minStack.addLast(x);
        }
        if(minStack.isEmpty()){
            minStack.addLast(x);
        }
    }

    public void pop() {
        if(!minStack.isEmpty() && minStack.peekLast().equals(stack.peekLast())){
            minStack.removeLast();
        }
        stack.removeLast();
    }

    public int top() {
        return stack.peekLast();
    }

    public int getMin() {
        return minStack.peekLast();
    }
}
