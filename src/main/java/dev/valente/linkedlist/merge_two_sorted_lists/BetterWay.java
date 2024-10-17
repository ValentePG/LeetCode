package dev.valente.linkedlist.merge_two_sorted_lists;

import dev.valente.linkedlist.ListNode;

public class BetterWay {
    public static void main(String[] args) {
        ListNode firstList = new ListNode(1);
        ListNode firstList2 = new ListNode(2);
        ListNode firstList3 = new ListNode(4);

        firstList.next = firstList2;
        firstList2.next = firstList3;



        ListNode secondList = new ListNode(1);
        ListNode secondList2 = new ListNode(3);
        ListNode secondList3 = new ListNode(4);

        secondList.next = secondList2;
        secondList2.next = secondList3;


        ListNode.printListNode(BetterWay.mergeTwoSortedLists(firstList, secondList));

    }

    public static ListNode mergeTwoSortedLists(ListNode list1, ListNode list2){
        ListNode head = new ListNode();

        ListNode temp = head;

        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                temp.next = list2;
                list2 = list2.next;
            } else {
                temp.next = list1;
                list1 = list1.next;
            }
            temp = temp.next;
        }
        if(list1 != null){
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        return head.next;
    }
}
