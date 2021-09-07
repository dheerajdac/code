package com.dheerajdac.code.leet.easy;


public class MaximumDepthOfBinaryTree {

    public int depth(TreeNode node,int depth){
        if(node == null){
            return depth;
        }
        depth++;
        int left = depth(node.left, depth);
        int right = depth(node.right, depth);
        return Math.max(left, right);
    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return depth(root,0);
    }

    public static void main(String[] args) {

    }


}
