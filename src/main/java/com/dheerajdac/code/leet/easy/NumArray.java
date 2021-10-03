
package com.dheerajdac.code.leet.easy;

public class NumArray {

    private int[] arr;
    private int[] sumArr;

    public NumArray(int[] nums) {
        arr = nums;
        int sum = 0;
        sumArr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            sum = sum + arr[i];
            sumArr[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        return sumArr[right] - sumArr[left] + arr[left];
    }
}