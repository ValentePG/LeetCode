package dev.valente.linkedlist.removenthfromlist;

import dev.valente.linkedlist.ListNode;

public class Solution {
    public static void main(String[] args) {
        ListNode node11 = new ListNode(1);
        node11.insertNode(node11, 2);
        node11.insertNode(node11, 3);
        node11.insertNode(node11, 4);
        node11.insertNode(node11, 5);

        removeNth(node11, 1);

        ListNode.printListNode(node11);

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
        // ** TEM FALHAS AQUI **
    }


}
