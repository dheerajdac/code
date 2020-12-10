package com.dheerajdac.code.leet.easy;


public class BinaryNumberToLinkedList{

private class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
    public int getDecimalValue(ListNode head) {
        
        int result = 0;

        while(head != null){
            result <<= 1;

            if(head.val == 1){
                result = result | 1;
            }
            head = head.next;
        }

        return result;

    }
}
