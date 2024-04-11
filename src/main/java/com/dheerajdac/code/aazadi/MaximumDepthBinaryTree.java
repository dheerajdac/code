package com.dheerajdac.code.aazadi;

public class MaximumDepthBinaryTree {

    public int depth(TreeNode root, int depth) {
        if(root == null) {
            return depth;
        }
        depth++;
        return Math.max(depth(root.left, depth), depth(root.right, depth));

    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return depth(root, 0);
    }
    
}
