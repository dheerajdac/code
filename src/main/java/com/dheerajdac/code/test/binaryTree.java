package com.dheerajdac.code.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class node {
    int value;
    node left, right;

    node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class binaryTree {
    node root;

    binaryTree(int value) {
        this.root = new node(value);
    }

    binaryTree() {
        this.root = null;
    }

    public static void main(String args[]) {
        binaryTree tree = new binaryTree(10);

        tree.root.left = new node(2);
        tree.root.right = new node(12);
        tree.root.left.left = new node(4);
        tree.root.right.right = new node(15);
        traverse(tree.root);
        dfs(tree);
    }

    private static void dfs(binaryTree tree) {
        Stack stack = new Stack<node>();
        stack.push(tree.root);
        while (!stack.empty()) {
            node temp = (node) stack.pop();
            if (temp.left != null)
                stack.push(temp.left);
            if (temp.right != null)
                stack.push(temp.right);
            System.out.println(temp.value);
        }
    }

    private static void bfs(binaryTree tree){
        Queue<node> queue = new LinkedList<>();


    }


    private static void traverse(node node) {
        if (node != null) {
            if (node.left != null) {
                traverse(node.left);
            }
            System.out.println(node.value);
            if (node.right != null) {
                traverse(node.right);
            }
        }
    }
}
