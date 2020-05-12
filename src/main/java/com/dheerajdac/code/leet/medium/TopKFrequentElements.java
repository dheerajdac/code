package com.dheerajdac.code.leet.medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], 0);
            map.computeIfPresent(nums[i], (key,v) -> v+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        queue.addAll(map.entrySet());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll().getKey();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,-1,2,-1,2,3};

        TopKFrequentElements elements = new TopKFrequentElements();
        elements.topKFrequent(arr, 2);
    }
}
