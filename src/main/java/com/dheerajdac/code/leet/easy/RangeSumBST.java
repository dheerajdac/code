package com.dheerajdac.code.leet.easy;

import java.util.*;

public class RangeSumBST {

    private class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }    
    public int rangeSumBST(TreeNode root, int low , int high){
    
        Deque<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);

        int sum = 0;
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();

            if(temp.val >= low && temp.val <= high){
                sum+= temp.val;
            }

            if(temp.left != null) {
                queue.add(temp.left);
            }

            if(temp.right != null){
                queue.add(temp.right);
            }
        }

        return sum;

    }

}
