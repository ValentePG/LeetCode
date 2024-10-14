package dev.valente.linkedlist;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void printListNode(ListNode node){
        ListNode justToPrint = node;

        while(justToPrint != null){

            System.out.println(justToPrint.val);

            justToPrint = justToPrint.next;
        }
    }
}
