package com.dheerajdac.code.leet.easy;

public class PeakIndexMountainArray {

    public int traverse(int[] arr, int start, int end){
        int mid = (end + start)/2;

        if(start == end){
            return start;
        }

        if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid +1]){
            return mid;
        }

        if(arr[mid] < arr[mid-1]){
            return traverse(arr, start, mid-1);
        }

        if(arr[mid] > arr[mid+1]){
            return traverse(arr, mid+1, end);
        }

        return mid;
    }
    public int peakIndexInMountainArray(int[] arr){
        return traverse(arr, 0 , arr.length);
    }

    public static void main(String[] args){

    }
    
}
