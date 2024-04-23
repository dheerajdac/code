package com.dheerajdac.code.aazadi;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        int i = 0;

        String str = strs[0];

        for (int j = 0; j < str.length(); j++) {
            char c = str.charAt(j);
            for (String string : strs) {
                if(string.length() >= j && string.charAt(j) == c){
                    i++;
                } else {
                    return str.substring(0, i+1);
                }
            }
        }
        return str;
    }
    
}
