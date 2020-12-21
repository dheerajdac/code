package com.dheerajdac.code.leet.easy;


public class FlipAndInvertImage {

    public int getInvertedValue(int a){
        return a == 0 ? 1: 0;
    }

    public int[][] flipAndInvertImage(int[][] A) {
        
        int length = A.length;

        for(int i=0; i < length; i++){
            int k = A[0].length/2;
            if(A[0].length %2 ==1){
                k++;
            }

            for(int j=0; j < k; j++){
                int temp = getInvertedValue(A[i][j]);
                int temp1 = getInvertedValue(A[i][length - j - 1]);
                A[i][j] = temp1;
                A[i][length - j -1] = temp;
            }
        }

        return A;

    }
}
