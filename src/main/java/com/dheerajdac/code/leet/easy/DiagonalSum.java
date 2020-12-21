package com.dheerajdac.code.leet.easy;

public class DiagonalSum {
    
    public int diagonalSum(int[][] mat){
        int length = mat.length;

        int result = 0;

        for(int i = 0; i < length; i++){
            result = mat[i][i] + mat[i][length-i -1];
        }

        if(length % 2 == 1){
            int i = length/2;
            result -= mat[i][i];
        }

        return result;

    }
}
