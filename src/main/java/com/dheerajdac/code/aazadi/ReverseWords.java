package com.dheerajdac.code.aazadi;

public class ReverseWords {


    public String reverseWords(String s) {
        String[] arr = s.split(" ");


        StringBuffer buffer =new StringBuffer();

        for (int i = arr.length -1; i > 0; i--) {
            if(!arr[i].trim().isEmpty()){
                buffer.append(arr[i]);
                buffer.append(' ');
            }
        }
        buffer.append(arr[0]);

        return buffer.toString();
        
    }
    
}
