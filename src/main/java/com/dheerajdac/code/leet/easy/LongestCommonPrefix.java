package com.dheerajdac.code.leet.easy;
/*
/longest-common-prefix
*/

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Queue;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }


        StringBuilder prefix = new StringBuilder(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            int commonLength = 0;
            if(prefix.length() > strs[i].length()){
                for (int j = 0; j < strs[i].length(); j++) {
                    if(strs[i].charAt(j) == prefix.charAt(j)){
                        commonLength++;
                    }
                    else{
                        break;
                    }
                }
            } else {
                for (int j = 0; j < prefix.length(); j++) {
                    if(strs[i].charAt(j) == prefix.charAt(j)){
                        commonLength++;
                    }
                    else{
                        break;
                    }
                }
            }
            prefix.delete(commonLength, prefix.length());

        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"dog","racecar","car"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(arr));
    }

}
