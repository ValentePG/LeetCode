package dev.valente.linkedlist.linkedlist_cycle;

import dev.valente.linkedlist.ListNode;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        ListNode node = new ListNode(3);
        node.insertNode(node, 2);
        node.insertNode(node, 0);
        ListNode cycleNode = new ListNode(-4);
        cycleNode.insertNode(cycleNode, node);

        System.out.println(Solution.hasCycle(node));

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
