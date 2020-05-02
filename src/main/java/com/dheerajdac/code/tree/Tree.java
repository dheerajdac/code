package com.dheerajdac.code.tree;

public class Tree{

    public static class Node {
        int value;
        Node right;
        Node left;
        
        public Node (int value){
            this.value = value;
            right = null;
            left = null;
        } 

    }

    public static Node recersive(Node root, int first, int second){
        if(root == null){
            return null;
        }

        if(root.value == first || root.value == second){
            return root;
        }

        Node left = recersive(root.left , first, second);
        Node right = recersive(root.right , first, second);

        if(left != null && right != null){
            return root;
        }
        if(left != null){
            return left;
        } else {
            return right;
        }
    }




    public static void main(String args[]) {

        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        
        System.out.println(recersive(root, 3, 7).value);
    }


}