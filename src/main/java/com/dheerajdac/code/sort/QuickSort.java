package com.dheerajdac.code.sort;

public class QuickSort {


    public static void sort(int[] arr, int start, int end){
        if(start < end){
        int pivotElement = arr[start];
        int pivot = end +1;
        for (int i = end; i > start ; i--) {
            if (arr[i] > pivotElement) {
                pivot--;
                int temp = arr[pivot];
                arr[pivot] = arr[i];
                arr[i] = temp;
            }
        }
            pivot--;
            int temp = arr[pivot];
            arr[pivot] = arr[start];
            arr[start] = temp;
                sort(arr, start, pivot - 1);
                sort(arr, pivot + 1, end);

        }

    }

    public static void main(String[] args) {
        int[] a= {2,1,6,3,4,9,7,5};
        sort(a, 0 , a.length-1);
        for( int value : a){
            System.out.println(value);
        }
    }
}
