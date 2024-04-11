package com.dheerajdac.code.aazadi;

public class  Sqrt {
    
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }

        int i = 0;
        int j = x;

        while(i<=j){
            int mid = i + (j-i)/2;
            int temp = x/mid;
            if(mid == temp) {
                return mid;
            } else if(mid < temp) {
                i = mid+1;
            } else {
                j = mid -1;
            }
        }

        return i-1;
        
    }
    
}
