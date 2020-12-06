package com.dheerajdac.code.leet.easy;

import java.util.*;

public class DecompressRLElist{

    public int[] decompressRLElist(int[] nums) {
        
        List<Integer> tempResult = new ArrayList<>();

        for(int i =0; i < nums.length; i+=2) {
            int freq = nums[i];
            int val = nums[i+1];

            for(int j = 0; j < freq; j++){
                tempResult.add(val);
            }
        }

        int[] result = new int[tempResult.size()];

        for(int i = 0; i < tempResult.size(); i++) {
            result[i] = tempResult.get(i); 
        }

        return result;

    }

}
