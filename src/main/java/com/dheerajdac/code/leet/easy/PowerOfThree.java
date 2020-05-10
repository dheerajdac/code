package com.dheerajdac.code.leet.easy;

public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        if(n==1)
            return true;
        if(n == 0  || n ==2){
            return false;
        }

        while (n > 0) {
            int rem  = n%3;
            n = n/3;
            if(rem == 0) {
                if (n == 1) {
                    return true;
                }
            }else {
                return false;
            }
        }

        return false;

    }

}
