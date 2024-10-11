package dev.valente.linkedlist.addtwonumber;

import dev.valente.linkedlist.ListNode;

public class BetterWay {

    public static void main(String[] args) {
        ListNode node11 = new ListNode(2);
        ListNode node12 = new ListNode(4);
        ListNode node13 = new ListNode(3);


        ListNode node21 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node23 = new ListNode(4);

        node11.next = node12;
        node12.next = node13;
        node21.next = node22;
        node22.next = node23;




        BetterWay.addTwoNumbers(node11, node21);
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