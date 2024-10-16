package dev.valente.linkedlist.remove_duplicates_from_sortedlist2;

import dev.valente.linkedlist.ListNode;

public class BetterWay {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        ListNode novo = deleteDuplicates(head);

        ListNode.printListNode(novo);
        System.out.println("");
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;

        while(head != null){
            if(head.next != null && head.val == head.next.val){
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                prev.next = head.next;
            } else {
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;

    }
}
