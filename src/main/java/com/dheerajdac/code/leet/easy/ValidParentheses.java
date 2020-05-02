package com.dheerajdac.code.leet.easy;
/*
valid-parentheses
*/

import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();

        for (char c: s.toCharArray()) {
            if(c == '{' || c == '[' || c == '('){
                stack.addLast(c);
            } else {
                if(c == '}') {
                    if(stack.size() !=0 && stack.peekLast() == '{'){
                        stack.removeLast();
                    } else {
                        stack.addLast(c);
                        break;
                    }
                }
                if(c == ']'){
                    if(stack.size() !=0 && stack.peekLast() == '['){
                        stack.removeLast();
                    } else {
                        stack.addLast(c);
                        break;
                    }
                }
                if(c == ')'){
                    if(stack.size() !=0 && stack.peekLast() == '('){
                        stack.removeLast();
                    } else {
                        stack.addLast(c);
                        break;
                    }
                }
            }
        }
        return stack.size() == 0;
    }
}
