package com.dheerajdac.code.leet.easy;

public class BusyStudent {

    public int busyStudent(int[] startTime, int[] endTime, int queryTime){
        
        int result = 0;

        for(int i =0; i < startTime.length; i++){
            if(startTime[i] <= queryTime && endTime[i] >= queryTime){
                result++;
            }
        }

        return result;

    }
}
