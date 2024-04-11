package com.dheerajdac.code.aazadi;

public class CountCompleteTreeNodes {


    public int countNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return 1 + (root.left != null ? countNodes(root.left) : 0) + (root.right != null ? countNodes(root.right) : 0);
    }
    
}
