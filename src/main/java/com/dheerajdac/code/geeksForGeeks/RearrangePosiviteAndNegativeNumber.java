package com.dheerajdac.code.geeksForGeeks;

public class RearrangePosiviteAndNegativeNumber {

    public static void rearrangeArray(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < 0 && arr[j-1] > 0) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {12,11,-13,-5,6,-7,5,-3,-6};
        rearrangeArray(arr);
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}