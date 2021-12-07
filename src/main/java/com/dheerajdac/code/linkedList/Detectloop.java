package com.dheerajdac.code.linkedList;


public class Detectloop {

    public static class Node {
        public int value;
        public Node next;
        public Node(int value) {
            this.value = value;
            next = null;
        }
    }

    public static boolean recurvise(Node first, Node second) {
        if(first.next == null || second.next == null || second.next.next ==null){
            return false;
        }
        if(first.next == second.next.next){
            return true;
        }
        return recurvise(first.next, second.next.next);
    }

    public static boolean detectoop(Node root){
        if(root == null) {
            return false;
        }
        if(recurvise(root, root)){
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
        return true;
    }


    public static void main(String[] args) {
        Node root  = new Node(1);
        Node first = new Node(2);
        root.next = first;
        Node second = new Node(3);
        first.next = second;
        Node Third = new Node(4);
        second.next = Third;
        Node forth = new Node(5);
        Third.next = forth;
        Node fifth = new Node(6);
        forth.next = fifth;
        fifth.next = second;


    }
}