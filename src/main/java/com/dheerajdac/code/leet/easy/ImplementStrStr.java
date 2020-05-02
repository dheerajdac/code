package com.dheerajdac.code.leet.easy;
/*
implement-strstr
*/

public class ImplementStrStr {

    public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)){
            return 0;
        }
        if(needle.length() > haystack.length()){
            return -1;
        }
        for (int i = 0; i < haystack.length() - needle.length()+1; i++) {

            int j = 0;
            for (; j < needle.length(); j++) {
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            }
            if(j == needle.length()){
                return i;
            }
        }
        return -1;
    }

}
