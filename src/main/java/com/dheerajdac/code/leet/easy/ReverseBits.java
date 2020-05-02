package com.dheerajdac.code.leet.easy;

//reverse-bits/

public class ReverseBits {

    public int reverseBits(int n) {
        int result = 0;
        boolean isNegative = false;
        if(n< 0){
            isNegative = true;
        }

        for (int i = 0; i < 31; i++) {

            result <<= 1;

            if((n&1) == 1){
                result ^= 1;
            }
            n >>= 1;
        }
        result <<= 1;
        if(isNegative){
            return result^=1;
        } else {
                return result;
        }
    }

    public static void main(String[] args) {
        ReverseBits reverseBits = new ReverseBits();
        System.out.println(reverseBits.reverseBits(-2147483645));
    }
}
