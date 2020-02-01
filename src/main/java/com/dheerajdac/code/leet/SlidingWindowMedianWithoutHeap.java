package com.dheerajdac.code.leet;

import java.util.Arrays;

public class SlidingWindowMedianWithoutHeap {

    public int binarySearch(int[] arr, int l, int r, int x){
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    public double getMedian(int[] nums){
        int k = nums.length/2;
        if(nums.length % 2 == 0){
            return ((nums[k] * 1.0) + nums[k-1])/2.0;
        } else {
            return nums[k]/1.0;
        }
    }

    private void replaceUsingInsersationSort(int[] arr, int indexOfElement, int num) {
        arr[indexOfElement] = num;

        for (int i = indexOfElement; i > 0; i--) {
            if(arr[i] < arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            } else {
                break;
            }
        }

        for (int i = indexOfElement; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            } else {
                break;
            }
        }
    }

    public double[] medianSlidingWindow(int[] nums, int k) {

        double[] result = new double[nums.length - k +1];
        int[] temp = Arrays.copyOfRange(nums, 0 ,k);
        Arrays.sort(temp);

        result[0] = getMedian(temp);

        for (int i = 0; i < nums.length - k; i++) {
            int indexOfElement = binarySearch(temp, 0, k-1,nums[i]);
            replaceUsingInsersationSort(temp, indexOfElement, nums[i+k]);
            result[i+1] = getMedian(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] temp = {5,2,2,7,3,7,9,0,2,3};
        SlidingWindowMedianWithoutHeap slidingWindowMedian = new SlidingWindowMedianWithoutHeap();
        slidingWindowMedian.medianSlidingWindow(temp, 9);
    }

}
