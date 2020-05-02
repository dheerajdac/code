package com.dheerajdac.code.leet.easy;


import com.dheerajdac.code.leet.ListNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        Deque<ListNode> stack = new LinkedList<>();

        if(head == null){
            return null;
        }

        while (head != null) {
            stack.addLast(head);
            head = head.next;
        }

        ListNode root = stack.removeLast();
        ListNode last = root;

        while (!stack.isEmpty()){
            last.next = stack.removeLast();
            last = last.next;
        }

        last.next = null;
        return root;
    }
}
