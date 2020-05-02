package com.dheerajdac.code.Array;

public class ArrayRotationSortedSearch {

    public static int findPivot(int [] arr, int start, int end) {
        int mid = (end + start) /2;

        if( arr[mid] < arr[mid - 1]) {
            return mid;
        }

        if(start == end && arr[mid] > arr[mid - 1]){
            return -1;
        }

        if(arr[mid] > arr[start]){
            return findPivot(arr, mid +1, end);
        }

        return findPivot(arr, start , mid-1);
    }

    public static int binarySearch(int[] arr, int start, int end, int ele){
        int mid = (end + start) / 2;

        if(arr[mid] == ele) {
            return mid;
        }

        if(start == end){
            return -1;
        }

        if (arr[mid] > ele) {
            return binarySearch(arr, 0 , mid -1 ,ele);
        }
        return binarySearch(arr, mid + 1, end, ele);
    }


    public static void findPair(int[] arr, int sum){

        int pivot =findPivot(arr, 0 ,arr.length);
        int smallest = pivot;
        int largest = pivot - 1;
        if( pivot < 1){
            smallest = 0;
            largest = arr.length;
        }
        for (int i = 0; i < arr.length; i++) {
            if(largest == smallest){
                System.out.println("nothing");
                break;
            }
            int temp = arr[largest] + arr[smallest];
            if(temp == sum){
                System.out.println(smallest + "" + largest);
                break;
            }

            if(temp > sum){
                largest = largest-1;
            } else {
                smallest = smallest + 1;
            }

            if(smallest > arr.length - 1){
                smallest = 0;
            }
            if( largest < 0){
                largest =arr.length;
            }



        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10,1};
        findPair(arr, 8);
    }
}
