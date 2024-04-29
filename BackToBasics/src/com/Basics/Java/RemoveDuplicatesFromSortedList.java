package com.Basics.Java;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode  newListNode = head;

        while(newListNode != null && newListNode.next != null) {
            if (newListNode.val == newListNode.next.val) {
                newListNode.next = newListNode.next.next;
            } else {
                newListNode = newListNode.next;
            }
    }
        return head;
    }


    public static void main(String[] args){
        ListNode  newListNode = new ListNode();
    }
}
