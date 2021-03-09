package com.dheerajdac.code.leet.easy;

import java.util.*;

public class RangeSumBST {

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
