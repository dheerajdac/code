package com.dheerajdac.code.leet.easy;
/*
remove-duplicates-from-sorted-array
*/

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int newLength = 0;
        int lastElement = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(lastElement != nums[i]) {
                nums[newLength] = nums[i];
                newLength++;
            }
            lastElement = nums[i];
        }

        return newLength;
    }

}
