package com.dheerajdac.code.leet.easy;

public class FindNumberWithEvenDigits {

    public int findNumbers(int[] nums){
        int result = 0;

        for(int i =0; i < nums.length; i++){
           int temp = nums[i];

           if(temp == 100000 || (temp > 9 && temp <100) || (temp > 999 && temp < 10000)){
            result++;
           }

        }
        return result;
    }

}
