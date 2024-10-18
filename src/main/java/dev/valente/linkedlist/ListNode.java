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

    public void insertNode(ListNode head, int val){
        ListNode newNode = new ListNode(val);
        ListNode temp = head;

        while(temp.next != null){

            temp = temp.next;
        }
        temp.next = newNode;
    }

    //Método criado apenas para fazer a lista virar uma lista circular
    public void insertNode(ListNode cycleNode, ListNode head){

        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = cycleNode;
        cycleNode.next = head;
    }


}
