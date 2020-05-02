package com.dheerajdac.code.leet.easy;

public class ClimbingStairs {

    public int climbStairs(int n) {
        if(n< 2)
            return n;

        int last =1;
        int latest =1;
        int i =0;

        while (i < n-1){

            int temp = last + latest;
            last = latest;
            latest = temp;
            i++;

        }

        return latest;
    }


}
