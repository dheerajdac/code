package com.dheerajdac.code.leet.easy;

import com.dheerajdac.code.leet.ListNode;

public class BinaryNumberToLinkedList {

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
