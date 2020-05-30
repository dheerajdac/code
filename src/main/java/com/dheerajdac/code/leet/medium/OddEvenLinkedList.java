package com.dheerajdac.code.leet.medium;

import com.dheerajdac.code.leet.ListNode;

public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode odd = head;
        ListNode evenHead = head.next;
        ListNode even = head.next;

        while (odd != null || even !=null){

            ListNode oddTemp = null;
            if(odd != null){
                if(odd.next != null){
                    oddTemp = odd.next.next;
                }
            }

            ListNode evenTemp = null;
            if(even != null){
                if(even.next != null){
                    evenTemp = even.next.next;
                }
            }

            if(odd != null){
                odd.next = oddTemp;
                odd = odd.next;
            }

            if(even != null){
                even.next = evenTemp;
                even = even.next;
            }
        }

        ListNode root = head;

        while (root.next != null){
            root = root.next;
        }

        root.next = evenHead;

        return head;

    }


}
