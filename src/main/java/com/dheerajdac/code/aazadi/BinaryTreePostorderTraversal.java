package com.dheerajdac.code.aazadi;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {

    public void traversal(TreeNode root, List<Integer> result){
        if(root != null) {
            if(root.left != null){
                traversal(root.left, result);
            }
            if(root.right != null){
                traversal(root.right, result);
            }
            result.add(root.val);
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root != null) {
            traversal(root, result);
        }
        return result;
    }
    
}
