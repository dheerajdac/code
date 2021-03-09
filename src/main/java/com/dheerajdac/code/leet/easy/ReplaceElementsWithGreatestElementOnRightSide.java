package com.dheerajdac.code.leet.easy;

public class ReplaceElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {
        int length = arr.length;

        int max = -1;
        
        for (int i = length-1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if(max < temp){
                max = temp;
            }
        }
        return arr;
    }
    
}
