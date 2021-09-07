package com.dheerajdac.code.leet.easy;

public class SortArrayByParity2 {


    public int[] sortArrayByParityII(int[] nums){
        
        int odd = 1;
        int even = 0;

        while(odd < nums.length && even < nums.length){
            while(odd < nums.length && nums[odd]%2 == 1){
                odd+=2;
            }
            while(even < nums.length && nums[even]%2 ==0){
                even+=2;
            }
            
            if(odd < nums.length && even < nums.length){
                int temp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = temp;
            }

            odd+=2;
            even+=2;
        }

        return nums;

    }
}
