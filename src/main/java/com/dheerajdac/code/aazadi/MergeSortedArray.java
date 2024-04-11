package com.dheerajdac.code.aazadi;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j =0;
        int i = 0;
        int[] result = new int[m+n];
        int k = 0;
        for (; k < result.length; k++) {
            if(i == m || j == n){
                break;
            }
            if(nums1[i] <= nums2[j]) {
                result[k] = nums1[i++];
            } else {
                result[k] = nums2[j++];
            }
            
        }
        
       

        if(i != m){
            for (int l = k; l < m+n; l++) {
                result[l] = nums1[i++];
            }
        }
        if(j != n) {
            for (int l = k; l < n+m; l++) {
                result[l] = nums2[j++];
            }
        }

        for (int l = 0; l < m+n; l++) {
            nums1[l] = result[l];
        }
    }
    
}
