package dev.valente.linkedlist.merge_two_sorted_lists;

import dev.valente.linkedlist.ListNode;

public class Solution {
    public static void main(String[] args) {
        ListNode firstList = new ListNode(1);
        firstList.insertNode(firstList, 2);
        firstList.insertNode(firstList, 4);

        ListNode secondList = new ListNode(1);
        secondList.insertNode(secondList, 3);
        secondList.insertNode(secondList, 4);

        ListNode.printListNode(Solution.mergeTwoSortedLists(firstList, secondList));

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
