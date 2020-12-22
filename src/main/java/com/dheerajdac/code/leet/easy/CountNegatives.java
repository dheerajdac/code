package com.dheerajdac.code.leet.easy;

public class CountNegatives {


    public int countNegatives(int[][] grid){
        int result = 0;

        int j = grid[0].length - 1;
        for(int i = 0; i < grid.length; i++){
            
            for(; j >= 0; j--){
                if(grid[i][j] >= 0){
                    break;
                }
            }
            result = result + grid[0].length - j - 1;
        }

        return result;
    }
}
