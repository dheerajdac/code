package com.dheerajdac.code.aazadi;

public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        
        while(head != null && head.val == val){
            head = head.next;
        }
        

        ListNode root = head;

        while(root != null) {
            if(root.next != null && root.next.val == val){
                root.next = root.next.next;
            }
            root = root.next;
        }

        return head;

    }
    
}
