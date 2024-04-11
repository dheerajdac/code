package com.dheerajdac.code.aazadi;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

    public static void traversal(TreeNode root, List<Integer> list) {
        if(root == null){
            return;
        }
        traversal(root.left, list);
        list.add(root.val);
        traversal(root.right, list);
        
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root, list);
        return list;
    }
    
}
