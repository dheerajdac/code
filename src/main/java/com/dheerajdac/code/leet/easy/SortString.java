package com.dheerajdac.code.leet.easy;

import java.util.*;

public class SortString {

    public String sortString(String s){
        
        int length = s.length();

        int[] arr = new int[26];


        for(int i = 0; i < length; i++){
            int index = s.charAt(i) - 'a';
            arr[index] = arr[index] + 1;  
        }

        StringBuilder sb = new StringBuilder();
        

        while(sb.length() != length){
            getChar(arr, sb, true);            
            getChar(arr, sb, false);            
        }

        return sb.toString();
    }

    public void getChar(int[] arr, StringBuilder sb, boolean flag){
        
        char c = 'a';

        for(int i =0; i < arr.length; i++){
            int j = flag ? i : 25 - i;
            
            if(arr[j] != 0){
                arr[j] = arr[j] - 1;
                sb.append((char)(j + c));
            }
        }

    }
}
