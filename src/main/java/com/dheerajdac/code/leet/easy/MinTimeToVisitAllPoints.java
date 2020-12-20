package com.dheerajdac.code.leet.easy;

public class MinTimeToVisitAllPoints{
    

    public int minTimeToVisitAllPoints(int[][] points) {
        
        int result = 0;

        for(int i = 0; i < points.length-1; i++){
            int x = Math.abs(points[i+1][0] - points[i][0]);
            int y = Math.abs(points[i+1][1] - points[i][1]);

            result = result + Math.max(x,y);
        }

        return result;
    }
}
