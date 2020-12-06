package com.dheerajdac.code.leet.easy;

import java.util.*;

public class SmallerNumbersThanCurrent {
    
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Integer[] list = new Integer[nums.length];

        for(int i = 0; i < nums.length; i++){
            list[i] = nums[i];
        }

        Arrays.sort(list, Collections.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < list.length; i++) {
            int key = list[i];

            while(true) {
                if(i < list.length-1){ 
                if(key != list[i+1])
                    {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    break;
                }
            }

            map.put(key, list.length - 1 - i);
        }
        
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]); 
        }

        return result;

    }
}
