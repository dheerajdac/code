package com.dheerajdac.code.leet.easy;

/*
merge-two-sorted-lists
*/


import com.dheerajdac.code.leet.ListNode;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        ListNode newRoot = null;
        ListNode lastNode = null;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                if(newRoot == null){
                    newRoot = l1;
                    lastNode = l1;
                    l1 = l1.next;
                } else {
                    lastNode.next = l1;
                    lastNode = l1;
                    l1 = l1.next;
                }
            } else {
                if(newRoot == null){
                    newRoot = l2;
                    lastNode = newRoot;
                    l2= l2.next;
                } else {
                    lastNode.next = l2;
                    lastNode = l2;
                    l2 = l2.next;
                }
            }
        }

        if(l1 == null){
            lastNode.next = l2;
        }
        if(l2 == null) {
            lastNode.next = l1;
        }

        return newRoot;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;

        node4.next = node5;
        node5.next = node6;

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode result  = mergeTwoSortedLists.mergeTwoLists(node1, node4);
        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}
