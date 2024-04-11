package com.dheerajdac.code.aazadi;


public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode root = new ListNode();
        ListNode result = root;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val){
                root.next = list1;
                list1 = list1.next;
            } else {
                root.next = list2;
                list2 = list2.next;
            }
            root = root.next;
        }

        while(list1 != null) {
            root.next = list1;
            list1 = list1.next;
            root = root.next;
        }

        while(list2 != null) {
            root.next = list2;
            list2 = list2.next;
            root = root.next;
        }
        return result.next;
    }

}