package com.dheerajdac.code.leet.easy;

import com.dheerajdac.code.leet.ListNode;

public class RemoveDuplicatesFromSortedList {


    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode root = head;
        ListNode next = root.next;
        while (next != null){
            if(root.val != next.val){
                root.next = next;
                root = next;
            }
            next = next.next;
        }
        root.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);

        node1.next = node2;
        node2.next = node3;
        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
        ListNode node = removeDuplicatesFromSortedList.deleteDuplicates(node1);

        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }

        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node = removeDuplicatesFromSortedList.deleteDuplicates(node1);

        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }

    }



}
