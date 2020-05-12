package com.dheerajdac.code.leet.medium;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int[] product1 = new int[nums.length];
        int[] product2 = new int[nums.length];

        product1[0] = 1;
        product2[nums.length-1] = 1;

        for (int i = nums.length-2; i >=0; i--) {
            product2[i] = product2[i+1] *nums[i+1];
        }

        for (int i = 1; i <nums.length; i++) {
            product1[i] = product1[i - 1]* nums[i-1];
        }

        for (int i = 0; i < nums.length; i++) {
            product1[i] = product1[i] * product2[i];
        }

        return product1;
    }
}
