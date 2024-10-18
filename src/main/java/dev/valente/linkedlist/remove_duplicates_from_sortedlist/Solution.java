package dev.valente.linkedlist.remove_duplicates_from_sortedlist;

import dev.valente.linkedlist.ListNode;

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.insertNode(head, 1);
        head.insertNode(head, 2);
        head.insertNode(head, 3);
        head.insertNode(head, 3);

        ListNode novo = deleteDuplicates(head);

        ListNode.printListNode(novo);
        System.out.println("");
    }

    public static ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null)  return head;

        ListNode temp = head;
        ListNode temp2 = head.next;

        while(temp != null && temp2 != null){
            while(temp2 != null && temp2.val == temp.val){
                temp2 = temp2.next;
            }
            temp.next = temp2;
            temp = temp.next;

            if(temp2 != null) temp2 = temp2.next;
        }

        return head;
    }
}
