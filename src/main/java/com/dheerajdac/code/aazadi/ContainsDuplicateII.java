package com.dheerajdac.code.aazadi;

import java.util.*;

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if(map.containsKey(value) && nums[i] == nums[map.get(value)]){
                if(Math.abs(i - map.get(value)) <= k) {
                    return true;
                } else {
                    map.put(value, i);
                }
                
            } else {
                map.put(value, i);
            }
        }
        return false;
    }
    
}
