package com.dheerajdac.code.leet.easy;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int newLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if(val != nums[i]){
                nums[newLength] = nums[i];
                newLength++;
            }
        }

        return newLength;
    }
}
