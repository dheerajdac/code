package com.dheerajdac.code.aazadi;

public class RemoveDuplicatesSortedList {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode root = head;

        while(root.next != null) {
            if(root.val == root.next.val){
                root.next = root.next.next;
            } else {
                root = root.next;
            }
        }


        return head;
        
    }
    
}
