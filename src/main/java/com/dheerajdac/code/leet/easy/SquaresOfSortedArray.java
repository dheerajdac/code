package com.dheerajdac.code.leet.easy;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums){
        int[] result = new int[nums.length];

        int i = 0;

        int j = nums.length - 1;

        while(i<j){
            if(Math.abs(nums[i]) < Math.abs(nums[j])){
                result[j-i] = nums[j];
                j--;
            } else{
                result[j-i] = nums[i];
                i++;
            }
        }
        
        for(int k = 0; k < nums.length; k++){
            result[k] = result[k] * result[k];
        }

        return result;
    }

    public static void main(String[] args){

    }
    
}
