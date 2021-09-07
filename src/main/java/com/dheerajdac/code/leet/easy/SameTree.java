package com.dheerajdac.code.leet.easy;

public class SameTree {




    public String inOrder(TreeNode node){

        if(node == null){
            return "";
        }
        String left ="q", right="q";

        if(node.left != null){
            left = inOrder(node.left);
        }
        if(node.right != null){
            right = inOrder(node.right);
        }
        return left + node.val + right;
    }

    public String preOrder(TreeNode node){

        if(node == null){
            return "";
        }
        String left ="q", right="q";

        if(node.left != null){
            left = inOrder(node.left);
        }
        if(node.right != null){
            right = inOrder(node.right);
        }
        return node.val + left  + right;
    }



    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(inOrder(p).equals(inOrder(q))){
            if(preOrder(p).equals(preOrder(q))){
                return true;
            }
        }
        return false;
    }



}
