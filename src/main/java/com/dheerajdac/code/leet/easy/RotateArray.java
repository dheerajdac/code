package com.dheerajdac.code.leet.easy;

public class RotateArray {

    public void reverse(int[] nums, int start, int end){
        int temp;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        if (k == 0)
            return;
        k++;
        int n = nums.length;
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

}
