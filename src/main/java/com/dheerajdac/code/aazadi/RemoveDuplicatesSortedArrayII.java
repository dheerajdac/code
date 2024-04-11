package com.dheerajdac.code.aazadi;

public class RemoveDuplicatesSortedArrayII {

    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }

        int i =1, j = 1;

        while(i < nums.length) {
            if(j == 1 || nums[i] != nums[j-2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    
}
