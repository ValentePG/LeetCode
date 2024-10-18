package dev.valente.linkedlist.reverse_list;

import dev.valente.linkedlist.ListNode;

public class Solution {
    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.insertNode(node, 2);
        node.insertNode(node, 3);
        node.insertNode(node, 4);
        node.insertNode(node, 5);

        ListNode.printListNode(reverseLinkedList(node));
    }

    public static ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;

        while(curr != null){

            next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;

        }

        return prev;
    }
}
