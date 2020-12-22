package com.dheerajdac.code.leet.easy;

public class MaxProduct {


    public int maxProduct(int[] nums){

        int firstMax = nums[0];
        int secondMax  = nums[1];

        for(int i = 1; i < nums.length; i++){
            if(nums[i] > firstMax){
                secondMax = firstMax;
                firstMax = nums[i];
            } else if(nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return (firstMax -1) * (secondMax -1);

    }
}
