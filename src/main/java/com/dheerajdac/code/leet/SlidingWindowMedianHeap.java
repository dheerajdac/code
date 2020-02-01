package com.dheerajdac.code.leet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SlidingWindowMedianHeap {

    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;

    public SlidingWindowMedianHeap(){
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public double getMedian(){
        if(maxHeap.size() == minHeap.size() && maxHeap.size() > 0){
            return ((maxHeap.peek() * 1.0) + minHeap.peek())/2.0;
        } else {
            if(minHeap.size() > 0)
                return minHeap.peek();
        }
        return 0;
    }

    public void addNum(int num) {
        if(minHeap.size() == 0) {
            minHeap.add(num);
        } else {
            if(minHeap.size() == maxHeap.size()){
                if(num > maxHeap.peek()){
                    minHeap.add(num);
                } else {
                    minHeap.add(maxHeap.poll());
                    maxHeap.add(num);
                }
            } else {
                if(num < minHeap.peek()){
                    maxHeap.add(num);
                } else {
                    maxHeap.add(minHeap.poll());
                    minHeap.add(num);
                }
            }
        }
    }

    public void buildHeaps(int[] arr, int k){
        for (int i = 0; i < k; i++) {
            addNum(arr[i]);
        }
    }

    public void removeElementFromHeap(int ele){
        if(maxHeap.size() == minHeap.size()){
            if(minHeap.remove(ele)){
                minHeap.add(maxHeap.poll());
            } else {
                maxHeap.remove(ele);
            }
        } else {
            if(!minHeap.remove(ele)){
                maxHeap.add(minHeap.poll());
                maxHeap.remove(ele);
            }
        }
    }


    public double[] medianSlidingWindow(int[] nums, int k) {

        double[] result = new double[nums.length - k +1];
        buildHeaps(nums, k);

        result[0] = getMedian();

        for (int i = 0; i < nums.length - k; i++) {
            removeElementFromHeap(nums[i]);
            addNum(nums[i+k]);
            result[i+1] = getMedian();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] temp = {5,2,2,7,3,7,9,0,2,3};
        SlidingWindowMedianHeap slidingWindowMedian = new SlidingWindowMedianHeap();
        slidingWindowMedian.medianSlidingWindow(temp, 9);
    }

}
