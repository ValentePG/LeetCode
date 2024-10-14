package dev.valente.linkedlist.remove_duplicates_from_sortedlist;

import dev.valente.linkedlist.ListNode;

public class BetterWay {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);



        ListNode novo = deleteDuplicates(head);

        ListNode.printListNode(novo);

    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode temp = head;



        while(temp != null){
            if(temp.next == null){
                temp = null;
            }
            else if(temp.val == temp.next.val ){

                temp.next = temp.next.next;
                temp = temp.next;
            }

        }

        return head;
    }
}
