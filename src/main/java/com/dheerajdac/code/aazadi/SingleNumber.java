package com.dheerajdac.code.aazadi;

import java.util.*;

public class SingleNumber {
    

    public int singleNumber(int[] nums) {
        int sumArr = 0;
        int sumSet = 0;
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            sumArr += num;
            set.add(num);
        }

        for (Integer integer : set) {
            sumSet += integer;
        }

        return (2* sumSet) - sumArr; 
    }
}
