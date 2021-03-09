package com.dheerajdac.code.leet.easy;

public class DiStringMatch {

    public int[] diStringMatch(String s) {

        int x = 0;
        int y = s.length();

        char[] arr = s.toCharArray();
        int[] result = new int[y+1];
        for (int i = 0; i < s.length(); i++) {
            if(arr[i] == 'I'){
                result[i] = x;
                x++;
            } else {
                result[i] = y;
                y--;
            }
        }

        result[arr.length] = x;

        return result;
    }
    
}
