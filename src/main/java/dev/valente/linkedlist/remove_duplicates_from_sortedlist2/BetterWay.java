package dev.valente.linkedlist.remove_duplicates_from_sortedlist2;

import dev.valente.linkedlist.ListNode;

public class BetterWay {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode novo = deleteDuplicates(head);

        ListNode.printListNode(novo);
        System.out.println("");
    }

    public static ListNode deleteDuplicates(ListNode head) {

        return null;
    }
}
