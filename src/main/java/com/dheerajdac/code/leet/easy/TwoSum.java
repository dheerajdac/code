package com.dheerajdac.code.leet.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
/two-sum/
*/
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(map.get(target - nums[i]) != null){
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }
            map.put(nums[i],i);
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] arr = {2, 7, 11, 15};
        int[] result = twoSum.twoSum(arr,9);
        System.out.println(result[0] +  "  " + result[1]);
    }

}
