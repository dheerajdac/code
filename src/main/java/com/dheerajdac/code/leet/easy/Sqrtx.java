package com.dheerajdac.code.leet.easy;

public class Sqrtx {

    public int square( int x){
        int start =1;
        int end = x;
        while (true) {
            if (start >= end) {
                return start;
            }
            int mid = start + (end-start) / 2;

            if (mid == x/mid) {
                return mid;
            } else if (mid > x/mid) {
                end = mid-1;
            } else {
                start = mid +1;
            }
        }
    }

    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int temp = square(x);

        if(temp <= x/temp){
            return temp;
        } else {
            return temp-1;
        }
    }

    public static void main(String[] args) {
        Sqrtx sqrtx = new Sqrtx();
        System.out.println(sqrtx.mySqrt(674478281));
    }

}
