package com.dheerajdac.code.leet.easy;

public class RemoveOuterparentheses {
    
    public String removeOuterParentheses(String s){
        

        StringBuilder sb = new StringBuilder();
        
        int count = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '('){
                count++;
            } else if(c == ')'){
                count--;
            }


            if(!((c == '(' && count == 1) || (c == ')' && count == 0))){
                sb.append(c);
            }

        }

        return sb.toString();


    }

}
