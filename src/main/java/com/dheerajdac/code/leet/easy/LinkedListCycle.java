package com.dheerajdac.code.leet.easy;

import com.dheerajdac.code.leet.ListNode;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }

        ListNode newHead = head.next.next;

        while (head != null && newHead != null){
            if(head == newHead){
                return true;
            }
            head = head.next;
            if(newHead.next == null){
                newHead = null;
            } else {
                newHead = newHead.next.next;
            }
        }

        return false;
    }

}
