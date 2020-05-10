package com.dheerajdac.code.leet.easy;

import com.dheerajdac.code.leet.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        Deque<ListNode> deque = new LinkedList<>();

        while (head != null){
            deque.add(head);
            head = head.next;
        }

        int temp = deque.size()%2;
        while (deque.size() > temp){
            if(deque.removeFirst().val != deque.removeLast().val){
                return false;
            }
        }
        return true;

    }

}
