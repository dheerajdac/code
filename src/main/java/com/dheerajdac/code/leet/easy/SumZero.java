package com.dheerajdac.code.leet.easy;

public class SumZero {

    public int[] sumZero(int n){
        
        int[] result = new int[n];

        int rem = n%2;

        for(int i=0; i < n-rem; i+=2){
            result[i] = (i+1);
            result[i] = (i+1) * -1;
        }

        if(rem == 1){
            result[n-1] = 0;
        }

        return result;

    }
}
