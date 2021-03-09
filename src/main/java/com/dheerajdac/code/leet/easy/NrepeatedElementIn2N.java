package com.dheerajdac.code.leet.easy;

public class NrepeatedElementIn2N {

    public int repeatedNTimes(int[] A){
        
        for (int i = 0; i < A.length; i++) {
            if(A[i] == A[i+1]){
                return A[i];
            }
        }
        return 0;
    }
    
}
