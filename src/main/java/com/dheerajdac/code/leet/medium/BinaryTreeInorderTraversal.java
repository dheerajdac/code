package com.dheerajdac.code.leet.medium;

import com.dheerajdac.code.leet.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal {


    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result  =new ArrayList<>();

        if(root == null){
            return result;
        }

        Deque<TreeNode> stack = new LinkedList<>();

        while (root != null || stack.size() >0){


            while (root!=null){
                stack.addLast(root);
                root = root.left;
            }

            TreeNode node = stack.removeLast();

            result.add(node.val);

            root = node.right;
        }

        return result;

    }
}
