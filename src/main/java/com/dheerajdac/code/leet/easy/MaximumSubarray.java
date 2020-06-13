package com.dheerajdac.code.leet.easy;
/*

maximum-subarray/

*/

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int totalSum =0;

        int maxTillNow = Integer.MIN_VALUE;
        int largestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(largestNumber < nums[i]){
                largestNumber = nums[i];
            }
            if(totalSum + nums[i] >  0){
                totalSum = totalSum + nums[i];
            } else {
                totalSum  = 0;
            }
            if(totalSum > maxTillNow){
                maxTillNow = totalSum;
            }
        }
        return  largestNumber < 0 ? largestNumber : maxTillNow;
    }

    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maximumSubarray.maxSubArray(nums));
    }
}
