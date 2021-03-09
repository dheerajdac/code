package com.dheerajdac.code.leet.easy;

public class RobotReturnToOrigin {

    public boolean judgeCircle(String moves){

        int v = 0;

        int h = 0;

        char[] arr = moves.toCharArray();

        for (int i = 0; i < moves.length(); i++) {
            char a = arr[i];
            
            if(a == 'R'){
                h++;
            } else if( a == 'L') {
                h--;
            } else if ( a == 'U') {
                v++;
            } else if (a == 'D') {
                v--;
            }
        }

        return h == 0 && v == 0;
    }
    
}
