package com.dheerajdac.code.leet.easy;


public class NumberOfStepsToZero {


    public int numberOfSteps(int num){
        
        int result = 0;

        while(num != 0) {
            result++;
            if((num & 1) == 1){
                num -= 1;
            } else {
                num >>= 1;
            }
        }

        return result;
    }
}
