package com.dheerajdac.code.Array;

public class KadaneAlgo {



    public static int LargestSum(int arr[]){
        int maxSofar = Integer.MIN_VALUE;
        int maxEndingHere = 0;


        for( int value : arr){
            maxEndingHere = Math.max(value, maxEndingHere + value);
            if(maxEndingHere > maxSofar){
                maxSofar = maxEndingHere;
            }
            if(maxEndingHere < 0){
                maxEndingHere = 0;
            }
        }
        return maxSofar;
    }

    public static void main(String[] args) {

    }
}
