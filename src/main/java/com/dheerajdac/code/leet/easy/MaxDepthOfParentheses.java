package com.dheerajdac.code.leet.easy;

public class MaxDepthOfParentheses{

    public int maxDepth(String s) {
        
        int maxTillNow = 0;

        int size = 0;

        for(int i=0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                size++;
            }
            if(s.charAt(i) == ')'){
                size--;
            }

            if(size > maxTillNow){
                maxTillNow = size;
            }
        }

        return maxTillNow;

    }
}
