package com.dheerajdac.code.leet.easy;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int candidate = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(count == 0) {
                candidate = nums[i];
            }
            count = count + (candidate == nums[i] ? 1 : -1);

            
        }
        return candidate;
    }

    public static void main(String[] args) {
        MajorityElement element = new MajorityElement();

        int[] value = {6,5,5};

        element.majorityElement(value);

    }
}
