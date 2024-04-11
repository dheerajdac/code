package com.dheerajdac.code.aazadi;

public class JumpGame {

    public boolean canJump(int[] nums) {
        if (nums[0] == 0) {
            return false;
        }

        int index = nums[0] - 1;

        while(index < nums.length-1){
            if (nums[0] == 0) {
                return false;
            }
            index += nums[index];
        }

        return index == nums.length-1;
    }
    
}
