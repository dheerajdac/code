package com.dheerajdac.code.leet.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        int length = (int) Math.pow(2, nums.length);
        List<List<Integer>> result = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            List<Integer> temp = new ArrayList<>();

            int num = i;
            int counter = 0;
            while (num > 0){
                int one = num&1;

                if(one ==1){
                    temp.add(nums[counter]);
                }
                counter++;
                num = num >> 1;
            }

            result.add(temp);
        }

        return result;
        
    }

    public static void main(String[] args) {
        Subsets subsets = new Subsets();

        int[] arr = {1,2,3};
        subsets.subsets(arr);
    }
}
