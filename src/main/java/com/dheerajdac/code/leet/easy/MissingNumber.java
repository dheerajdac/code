package com.dheerajdac.code.leet.easy;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int totalSum = ((nums.length+1)*nums.length)/2;

        for (int i = 0; i < nums.length; i++) {
            totalSum = totalSum - nums[i];
        }
        return totalSum;
    }

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        int[] arr = {3,0,1};
        System.out.println(missingNumber.missingNumber(arr));
    }
}
