package com.dheerajdac.code.leet.easy;

import java.util.*;

public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurences(int[] arr){
        int offset = 1000;
        int[] fre = new int[2001];

        for(int i =0; i < arr.length; i++){
            fre[offset + arr[i]]++;
        }
        
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < fre.length; i++){
            if(fre[i] != 0){
                if(set.contains(fre[i])){
                    return false;
                } else {
                    set.add(fre[i]);
                }

            }
        }

        return true;

    }

    public static void main(String[] args){

    }
    
}
