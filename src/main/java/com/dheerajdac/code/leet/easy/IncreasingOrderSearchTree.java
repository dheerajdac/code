package com.dheerajdac.code.leet.easy;

import java.util.Stack;

public class IncreasingOrderSearchTree {



    public TreeNode increasingBST(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();

        if(root != null){
            stack.push(root);
        }
        
        TreeNode head = null;        
        TreeNode nextNode = null;
        while(!stack.empty()){
            TreeNode temp = stack.pop();
            
            if(temp.left == null && temp.right == null){
                if(head == null){
                    head = temp;
                    nextNode = temp;
                } else {
                    nextNode.right = temp;
                    nextNode = nextNode.right;
                }
            } else {
                if(temp.right != null){
                    stack.push(temp.right);
                }
                stack.push(temp);
                if(temp.left != null){
                    stack.push(temp.left);
                }
                temp.left = null;
                temp.right = null;
            }
        }

        return head;
    }


    public static void main(String[] args){
        IncreasingOrderSearchTree tree = new IncreasingOrderSearchTree();
        TreeNode node = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(6);
        node.left = node1;
        node.right = node2;
        TreeNode node3 = new TreeNode(2);
        node1.left = node3;

        tree.increasingBST(node);
    }
    
}
