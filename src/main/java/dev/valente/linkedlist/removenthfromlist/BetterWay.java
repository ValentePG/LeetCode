package dev.valente.linkedlist.removenthfromlist;

import dev.valente.linkedlist.ListNode;

public class BetterWay {
    public static void main(String[] args) {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node13 = new ListNode(3);
        ListNode node14 = new ListNode(4);
        ListNode node15 = new ListNode(5);


        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;





        removeNth(node11, 2);

        printListNode(node11);

    }

    public static ListNode removeNth(ListNode node, int position){

        ListNode fast = node, slow = node;
        for (int i = 0; i < position; i++){
            fast = fast.next;
        }
        if (fast == null){
            return node.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return node;

    }

    public static void printListNode(ListNode node){
        ListNode justToPrint = node;

        while(justToPrint != null){

            System.out.println(justToPrint.val);

            justToPrint = justToPrint.next;
        }
    }
}
