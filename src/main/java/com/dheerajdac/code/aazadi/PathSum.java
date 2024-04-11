package com.dheerajdac.code.aazadi;

public class PathSum {


    public static boolean sum(TreeNode root, int targetSum) {
        if(root == null){
            return targetSum == 0;
        }

        if(root.left == null){
            return sum(root.right, targetSum - root.val);
        }

        if(root.right == null){
            return sum(root.left, targetSum - root.val);
        }

        return sum(root.left, targetSum - root.val) || sum(root.right, targetSum - root.val);

    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }

        return sum(root, targetSum);

    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode(1, new TreeNode(2), null);
        System.out.println(hasPathSum(node, 1));
    }
    
}
