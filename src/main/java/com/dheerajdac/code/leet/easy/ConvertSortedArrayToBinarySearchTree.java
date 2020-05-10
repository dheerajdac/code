package com.dheerajdac.code.leet.easy;

import java.util.LinkedList;
import java.util.Queue;

public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode binaryTree(int[] nums,int start, int end){
        if(start >= end){
            return new TreeNode(nums[start]);
        }

        int mid = (start + end) /2;

        TreeNode node = new TreeNode(nums[mid]);

        if(start <= mid -1)
            node.left = binaryTree(nums, start, mid-1);
        if(mid+1 <= end)
            node.right = binaryTree(nums, mid+1, end);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums == null || nums.length ==0){
            return null;
        }
        if(nums.length ==1){
            return new TreeNode(nums[0]);
        }

        return binaryTree(nums, 0, nums.length-1);
    }


    public static void main(String[] args) {
        ConvertSortedArrayToBinarySearchTree tree = new ConvertSortedArrayToBinarySearchTree();
        int[] nums = {-10,-3,0,5,9};
        tree.sortedArrayToBST(nums);
    }
}
