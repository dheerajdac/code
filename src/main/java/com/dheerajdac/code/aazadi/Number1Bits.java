package com.dheerajdac.code.aazadi;

public class Number1Bits {

    public int hammingWeight(int n) {

        int result = 0;

        for(int i=0; i<32; i++) {
            if((n&1) == 1){
                result++;
            }
            n >>= 1;
        }
        return result;
    }
    
}
