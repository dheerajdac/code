package com.dheerajdac.code.leet.easy;

import java.util.*;

public class CreateTargetArray{
    
    public int[] createTargetArray(int[] nums, int[] index){
        LinkedList<Integer> list = new LinkedList<>();

        for(int i =0; i < nums.length; i++){
            list.add(index[i], nums[i]);
        }

        int[] result = new int[nums.length];

        for(int i =0; i < nums.length; i++){
            result[i] = list.get(i);
        } 

        return result;

    }
}
