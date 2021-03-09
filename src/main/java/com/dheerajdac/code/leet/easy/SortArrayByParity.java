package com.dheerajdac.code.leet.easy;

public class SortArrayByParity {


    public int[] sortArrayByParity(int[] A){
        
        int i =0;
        int j = A.length - 1;

        while(i < j){
            if(A[i] % 2 == 1){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j--;
            } else {
                i++;
            }
        }

        return A;

    }
}
