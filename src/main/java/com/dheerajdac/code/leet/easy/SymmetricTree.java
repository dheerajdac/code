package com.dheerajdac.code.leet.easy;

public class SymmetricTree {


    public String leftSideTree(TreeNode node){
        if(node == null){
            return "q";
        }

        String left = leftSideTree(node.left);
        String mid = Integer.toString(node.val);
        String right = leftSideTree(node.right);

        return mid + left  +right;
    }

    public String rightSideTree(TreeNode node){
        if(node == null){
            return "q";
        }

        String left = rightSideTree(node.left);
        String mid = Integer.toString(node.val);
        String right = rightSideTree(node.right);

        return mid + right + left;
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        String left = leftSideTree(root.left);
        String right = rightSideTree(root.right);
        return left.equals(right);
    }

    public static void main(String[] args) {
        SymmetricTree tree = new SymmetricTree();
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(2);

        node.left = node1;
        node.right = node2;
        node1.left = node3;
        node2.left = node4;

        tree.isSymmetric(node);
    }


}

