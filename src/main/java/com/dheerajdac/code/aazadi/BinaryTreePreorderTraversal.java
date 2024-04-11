package com.dheerajdac.code.aazadi;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    public void traversal(TreeNode root, List<Integer> result){
        if(root != null) {
            result.add(root.val);
            if(root.left != null){
                traversal(root.left, result);
            }
            if(root.right != null){
                traversal(root.right, result);
            }
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root != null) {
            traversal(root, result);
        }
        return result;
    }
    
}
