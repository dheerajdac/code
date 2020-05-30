package com.dheerajdac.code.leet.medium;

import com.dheerajdac.code.leet.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {


        Deque<TreeNode> deque = new LinkedList<>();
        Deque<TreeNode> deque1 = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        deque.addLast(root);

        while (!deque.isEmpty() || !deque1.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            while (!deque.isEmpty()){
                TreeNode node = deque.removeFirst();
                temp.add(node.val);
                if(node.left != null){
                    deque1.addLast(node.left);
                }
                if(node.right != null){
                    deque1.addLast(node.right);
                }
            }

            if(!temp.isEmpty()){
                result.add(temp);
            }

            List<Integer> temp1 = new ArrayList<>();

            while (!deque1.isEmpty()){
                TreeNode node = deque1.removeFirst();
                temp1.add(node.val);
                if(node.left != null){
                    deque.addLast(node.left);
                }
                if(node.right != null){
                    deque.addLast(node.right);
                }
            }

            if(!temp1.isEmpty()){
                result.add(temp1);
            }

        }
        return result;

    }


}
