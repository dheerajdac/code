package com.dheerajdac.code.leet.easy;

import com.dheerajdac.code.leet.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        Deque<ListNode> stack1 = new LinkedList<>();
        Deque<ListNode> stack2 = new LinkedList<>();

        while (headA != null){
            stack1.addLast(headA);
            headA = headA.next;
        }

        while (headB != null){
            stack2.addLast(headB);
            headB = headB.next;
        }

        ListNode result = null;
        while (!stack1.isEmpty() && !stack2.isEmpty()){
            ListNode temp = stack1.removeLast();
            ListNode temp1 = stack2.removeLast();

            if (temp == temp1) {
                result = temp;
            } else {
                break;
            }
        }

        return result;
    }
}
