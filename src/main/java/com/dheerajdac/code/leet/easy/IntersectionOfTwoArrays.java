package com.dheerajdac.code.leet.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map.putIfAbsent(nums1[i],0);
            map.computeIfPresent(nums1[i],(k,v) -> v+1);
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums2.length; i++) {
            if(map.get(nums2[i]) != null && map.get(nums2[i]) > 0){
                list.add(nums2[i]);
                map.computeIfPresent(nums2[i],(k,v) -> v-1);
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}
