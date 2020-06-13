package com.dheerajdac.code.leet.medium;

import com.dheerajdac.code.leet.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        int val = l1.val + l2.val;
        int carry = val/10;
        ListNode result = new ListNode(val%10);
        ListNode node = result;

        l1 = l1.next;
        l2 = l2.next;

        while (l1!=null && l2!=null){
            int temp = l1.val + l2.val + carry;
            carry = temp/10;
            node.next = new ListNode(temp%10);
            node = node.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null){
            int temp = l1.val +carry;
            carry = temp/10;
            node.next = new ListNode(temp%10);
            node = node.next;
            l1 = l1.next;
        }

        while (l2 != null){
            int temp = l2.val +carry;
            carry = temp/10;
            node.next = new ListNode(temp%10);
            node = node.next;
            l2 = l2.next;
        }

        if(carry == 1){
            node.next = new ListNode(1);
        }

        return result;

    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);

        //node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(7);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);

        node4.next = node5;
        node5.next = node6;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode node = addTwoNumbers.addTwoNumbers(node1, node4);

        while (node!= null){
            System.out.println(node.val);
            node = node.next;
        }


    }
}
