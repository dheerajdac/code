
package com.dheerajdac.code.leet.easy;

import java.util.*;

public class MyQueue {

    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    int first;

    /** Initialize your data structure here. */
    public MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(s1.size() == 0){
		first = x;
	}
	s1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
	    while(!s1.empty()){
		    s2.push(s1.pop());
	    }

	    int result = s2.pop();

	    if(s2.size() >=1){
		    first = s2.peek();
	    }

	   while(!s2.empty()){
		    s1.push(s2.pop());
	    } 

	return result;
        
    }
    
    /** Get the front element. */
    public int peek() {
        return first;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.empty();
    }
}