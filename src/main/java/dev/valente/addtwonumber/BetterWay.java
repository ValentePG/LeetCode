package dev.valente.addtwonumber;

public class BetterWay {

    public static void main(String[] args) {
        ListNode node11 = new ListNode(9);
        ListNode node12 = new ListNode(9);
        ListNode node13 = new ListNode(9);
        ListNode node14 = new ListNode(9);
        ListNode node15 = new ListNode(9);
        ListNode node16 = new ListNode(9);
        ListNode node17 = new ListNode(9);


        ListNode node21 = new ListNode(9);
        ListNode node22 = new ListNode(9);
        ListNode node23 = new ListNode(9);
        ListNode node24 = new ListNode(9);

        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;
        node15.next = node16;
        node16.next = node17;

        node21.next = node22;
        node22.next = node23;
        node23.next = node24;



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