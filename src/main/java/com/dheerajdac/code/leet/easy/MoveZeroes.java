package com.dheerajdac.code.leet.easy;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int i=0, j=1;

        if(nums== null || nums.length == 0 || nums.length ==1){
            return;
        }

        while (i < nums.length && j <nums.length){

            if(nums[i]==0){
                if(nums[j] == 0){
                    j++;
                } else {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            } else {
                i++;
                j++;
            }
        }
    }
}
