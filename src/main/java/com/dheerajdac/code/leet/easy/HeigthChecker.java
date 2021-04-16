package com.dheerajdac.code.leet.easy;

public class HeigthChecker {

    public int heightChecker(int[] heights) {

        int[] fre = new int[101];

        for(int height : heights){
            fre[height] = fre[height] + 1;
        }

        int result = 0 ;
        int currentHeight = 0;

        for (int i = 0; i < heights.length; i++) {
            while(fre[currentHeight] == 0){
                currentHeight++;
            }

            if(currentHeight != heights[i]){
                result++;
            }

            fre[currentHeight]--;
        }

        return result;

    }

    
}
