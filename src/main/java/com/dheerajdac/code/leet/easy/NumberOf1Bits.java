package com.dheerajdac.code.leet.easy;

public class NumberOf1Bits {

    public int hammingWeight(int n) {
        boolean negative = false;
        if(n <0){
            negative =true;
        }
        if(n==0){
            return 0;
        }

        int result =0 ;

        for (int i = 0; i < 31; i++) {
            if((n&1) == 1){
                result++;
            }
            n >>= 1;
        }
        if(negative){
            return result+1;
        }
        return result;
    }

}
