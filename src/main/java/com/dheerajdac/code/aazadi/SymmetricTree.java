package com.dheerajdac.code.aazadi;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return false;
        }
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode l, TreeNode f) {
        if(l == null && f == null) {
            return true;
        }

        if(l == null || f == null) {
            return false;
        }

        if(l.val !=  f.val){
            return false;
        }

        return isMirror(l.left, f.right) && isMirror(l.right, f.left);
    }
    
}
