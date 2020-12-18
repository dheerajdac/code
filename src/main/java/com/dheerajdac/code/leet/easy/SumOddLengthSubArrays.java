package com.dheerajdac.code.leet.easy;


public class SumOddLengthSubArrays {


    public int sumOddLengthSubarrays(int[] arr) {
        
        int result = 0;

        for(int i =0; i < arr.length; i++){
            int sum = 0;
            for(int j=i; j< arr.length; j+=2){
                sum = sum + arr[j];
                if(((j-i) & 1) == 0){
                    result += sum;
                }
            }
        }

        return result;
    }
}
