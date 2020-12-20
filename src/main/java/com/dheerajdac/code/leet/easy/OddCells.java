package com.dheerajdac.code.leet.easy;

public class OddCells{
    
    public int oddCells(int n, int m, int[][] indices) {
        
        int[] row = new int[n];
        int[] col = new int[m];

        for(int i=0; i< indices.length; i++){
            row[indices[i][0]] += 1;
            col[indices[i][1]] += 1;
        }

        int result =0;
        for(int i=0; i < n ; i++){
            for(int j =0; j < m; j++){
                if((row[i]+col[j]) % 2 ==1 ){
                    result++;
                }
            }
        }

        return result;

    }
}
