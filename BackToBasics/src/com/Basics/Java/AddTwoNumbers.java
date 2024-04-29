package com.Basics.Java;

public class AddTwoNumbers {
    public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dumNode = new ListNode(0);
        ListNode A= l1, B = l2, C = dumNode;
        int carryBit = 0;

        while(A!=null||B!=null){
 /*           int x  = (A!=null)?A.val:0;
            int y  = (B!=null)?B.val:0;
                        int sum = x+y+carryBit;

*/
            int sum = ((A!=null)?A.val:0)+((B!=null)?B.val:0)+carryBit;
            carryBit = sum/10;
            C.next = new ListNode(sum%10);
            C = C.next;
            if(A!=null) A = A.next;
            if(B!=null) B = B.next;
        }
        if(carryBit>0) C.next = new ListNode(carryBit);
        return dumNode;
    }

    public static void main(String[] args){
        ListNode  newListNode1 = new ListNode(2,new ListNode(4, new ListNode(3)));
        ListNode  newListNode2 = new ListNode(5,new ListNode(6, new ListNode(4)));

        System.out.println(addTwoNumbers(newListNode1,newListNode2));
    }


}
