package dev.valente.linkedlist.add_two_number;

import dev.valente.linkedlist.ListNode;

public class Solution {

    public static void main(String[] args) {
        ListNode node = new ListNode(2);
        node.insertNode(node, 4);
        node.insertNode(node, 3);

        ListNode node2 = new ListNode(5);
        node2.insertNode(node2, 6);
        node2.insertNode(node2, 4);

        ListNode.printListNode(Solution.addTwoNumbers(node, node2));
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode();
        ListNode res = head;

        int carry = 0, total = 0;

        while(l1 != null || l2 != null || carry != 0){
            total = carry;

            if(l1 != null){
                total += l1.val;
                l1 = l1.next;

            }

            if(l2 != null){
                total += l2.val;
                l2 = l2.next;
            }

            int num = total % 10;
            carry = total / 10;
            head.next = new ListNode(num);
            head = head.next;



        }

        return res.next;

    }


}