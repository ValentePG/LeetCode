package dev.valente.linkedlist.linkedlist_cycle;

import dev.valente.linkedlist.ListNode;

import java.util.HashMap;

public class BetterWay {
    public static void main(String[] args) {
        ListNode node = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println(BetterWay.hasCycle(node));

    }

    public static boolean hasCycle(ListNode head){
        int cont = 0;
        ListNode temp = head;

        HashMap<ListNode, Integer> map = new HashMap<>();

        if(head == null || head.next == null) return false;

        while(temp.next != null){
            if(map.containsKey(temp)){
                return true;
            }
            map.put(temp, cont);
            temp = temp.next;
            cont += 1;
        }

        return false;
    }
}
