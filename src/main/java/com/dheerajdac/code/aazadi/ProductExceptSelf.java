package com.dheerajdac.code.aazadi;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int containsZero = 0;
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                containsZero++;
            } else {
                product *= nums[i];
            }
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++) {
            if(containsZero != 0) {
                if(containsZero == 1) {
                    result[i] = nums[i] == 0 ? product : 0;
                } else {
                    result[i] = 0;
                }

            } else {
                result[i] = product/nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};

        productExceptSelf(arr);
    }
    
}
