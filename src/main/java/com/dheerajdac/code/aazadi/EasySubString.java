package com.dheerajdac.code.aazadi;

public class EasySubString {

    public int strStr(String haystack, String needle) {
        
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            int j = 0;
            while(j < needle.length()){
                if(haystack.charAt(i) != needle.charAt(j)){
                    break;
                }
                j++;
            }
            if(j == needle.length()){
                return i;
            }
        }
        return -1;
    }
    
}