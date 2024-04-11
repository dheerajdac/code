package com.dheerajdac.code.aazadi;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if(head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNode temp = reverseList(head.next);
        next.next = head;
        return temp;
    }
    
}
