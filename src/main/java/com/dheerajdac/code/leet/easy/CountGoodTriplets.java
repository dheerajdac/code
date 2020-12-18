package com.dheerajdac.code.leet.easy;

public class CountGoodTriplets {
    
    public int absDiff(int x , int y){
        return Math.abs(x-y);
    }

    public int countGoodTriplets(int[] arr, int a, int b, int c) {
    
        int result = 0;

        for(int i = 0; i< arr.length; i++){
            for(int j =i+1; j< arr.length; j++){
                if(absDiff(arr[i], arr[j]) <= a){
                    for(int k = j+1; k < arr.length; k++){
                        if(absDiff(arr[j], arr[k]) <= b && absDiff(arr[i], arr[k])<= c){
                            result++;
                        }
                    }
                }
            }
        }
        return result;
    }
    
}
