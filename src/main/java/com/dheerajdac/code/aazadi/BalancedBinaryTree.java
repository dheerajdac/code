package com.dheerajdac.code.aazadi;

public class BalancedBinaryTree {

    public int height(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);

        return Math.abs(right-left);
    }
    
    public boolean isBalanced(TreeNode root) {
        return height(root) <= 1;
    }

}
