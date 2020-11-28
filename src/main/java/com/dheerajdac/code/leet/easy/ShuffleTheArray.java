package com.dheerajdac.code.leet.easy;

import java.util.HashMap;
import java.util.Map;

/*
/two-sum/
*/
public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {
       int[] arr = new int[nums.length];
        int x = 0;
        int y = nums.length/2;
       for(int i=0; i < nums.length/2; i++){
            arr[i*2] = nums[x++];
            arr[i*2+1] = nums[y++];
       }
       return arr;

    }


}
