package com.dheerajdac.code.test;

public class ReverseLinkedList {

    public Node root;

    public void add(Node node){
        node.next = root;
        root = node;
    }

    public void reverse(){
        Node node = root;
        Node nxt = root.next;
        root.next = null;
        while (nxt != null){
            Node temp = nxt.next;
            nxt.next = node;
            node = nxt;
            nxt = temp;
        }
        root = node;
    }


    public void testResursion(Node root){
        this.root = resursionKresever(root, null, root, 3);
    }

    public Node resursionKresever(Node node, Node pervious, Node preHead, int k){
        if(node != null && k >0){
            Node temp = node.next;
            node.next = pervious;
            return resursionKresever(temp, node, preHead, --k);
        } else {
            if(node != null){
                preHead.next =  resursionKresever(node, null, node, 3);
            }
            return pervious;
        }
    }


    public Node resursionReverse(Node node , Node pervious){
        if(node != null){
            Node temp = node.next;
            node.next = pervious;
            resursionReverse(temp, node);
        } else{
            root = pervious;
        }
        return node;
    }

    public void print(){
        Node node = root;
        while(node != null){
            System.out.println(node.value);
            node = node.next;
        }
    }


static class Node{
    public int value;
    public Node next = null;

    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
}



    public static void main(String args[]){
        ReverseLinkedList linkedList = new ReverseLinkedList();
        Node node = new Node(0,null);
        Node node1 = new Node(1,null);
        Node node2 = new Node(2,null);
        Node node3 = new Node(3,null);
        Node node4 = new Node(4,null);
        Node node5 = new Node(5,null);
        Node node6 = new Node(6,null);
        Node node7 = new Node(7,null);
        linkedList.add(node7);
        linkedList.add(node6);
        linkedList.add(node5);
        linkedList.add(node4);
        linkedList.add(node3);
        linkedList.add(node2);
        linkedList.add(node1);
        linkedList.add(node);
        linkedList.print();
        /*linkedList.reverse();
        linkedList.print();
        Node temp = linkedList.root.next;
        linkedList.root.next =null;
        linkedList.root = linkedList.resursionReverse(temp , linkedList.root);
        linkedList.print();*/
        linkedList.testResursion(linkedList.root);
        linkedList.print();
    }

}
