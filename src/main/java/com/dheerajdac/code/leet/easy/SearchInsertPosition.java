package com.dheerajdac.code.leet.easy;
/*
search-insert-position
*/

public class SearchInsertPosition {

    public int search(int[] nums, int start, int end, int target){
        if(start == end){
            if(nums[start] == target){
                return start;
            }
            return start;
        }
        int mid = (start + end)/2;
        if(nums[mid] == target){
            return mid;
        }

        if(nums[mid] > target){
            return search(nums, start, mid,target);
        }
        return search(nums, mid +1, end, target);
    }

    public int searchInsert(int[] nums, int target) {

        if(nums[nums.length-1] < target){
            return nums.length;
        }
        if(nums[0] > target)
            return 0;

        return search(nums,0, nums.length -1, target);
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,6};
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.println(searchInsertPosition.searchInsert(nums,7));
    }
}
