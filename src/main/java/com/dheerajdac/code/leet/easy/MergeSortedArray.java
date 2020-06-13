package com.dheerajdac.code.leet.easy;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n ==0 ){
            return;
        }
        int i =0;
        int x= 0;
        while (i < m){
            if(nums1[i] > nums2[0]){
                int temp = nums1[i];
                nums1[i] = nums2[0];
                nums2[0] = temp;
            }

            for (int j = 0; j < n-1; j++) {
                if(nums2[j] > nums2[j+1]){
                    int temp = nums2[j];
                    nums2[j] = nums2[j+1];
                    nums2[j+1] = temp;
                } else {
                    break;
                }
            }
            i++;
        }

        while (x < n) {
            nums1[i] = nums2[x];
            i++;
            x++;
        }
    }


    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        mergeSortedArray.merge(nums1, 3, nums2, nums2.length);
        System.out.println(Arrays.toString(nums1));
    }

}
