package com.dheerajdac.code.tree;

public class DistanceBetweenTwoNode {

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


    public static int recursive(Node node, int first, int second, int depth) {

        if(node == null) {
            return -1;
        }
        int distance = -1;
        if(node.value == first || node.value == second){
            distance = depth;
        }

        int left = recursive(node.left, first, second, depth+1);
        int right = recursive(node.right, first, second, depth+1);
        
        if(left != -1 && right != -1){
            return left + right - (2 * depth);
        }

        if(left != -1 && distance != -1){
            return left - distance;
        }

        if(right != -1 && distance != -1){
            return right - distance;
        }

        if(left != -1 )
            return left;

        if(right != -1)
            return right;

        return distance;
    }


    public static void main(String args[]) {

        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        
        System.out.println(recursive(root, 6, 7,0));
    }
}