package com.dheerajdac.code.leet.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayPartition1 {

    public int arrayPairSum(int[] nums){

        List<Integer> list = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
           list.add(nums[i]); 
        }

        Collections.sort(list);

        int sum = 0;

        for (int i = 0; i < nums.length; i+=2) {
            sum = sum + list.get(i);
        }

        return sum;

    }
    
}
