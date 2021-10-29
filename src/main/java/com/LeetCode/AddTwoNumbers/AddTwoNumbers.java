package com.LeetCode.AddTwoNumbers;

import lombok.val;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carryOver = 0;
        ListNode listNode = new ListNode();
        ListNode first = listNode;
        while (true) {
            if (l1 == null && l2 == null) {
                listNode.val = carryOver;
                carryOver = carryOver/10;
            } else if (l1 == null) {
                listNode.val = (l2.val + carryOver)%10;
                carryOver = (l2.val +carryOver)/10;
                l2 = l2.next;
            } else if (l2 == null) {
                listNode.val = (l1.val + carryOver)%10;
                carryOver = (l1.val + carryOver)/10;
                l1 = l1.next;
            } else {
                listNode.val = (l1.val + l2.val + carryOver) % 10;
                carryOver = (l1.val + l2.val + carryOver) / 10;
                l1 = l1.next;
                l2 = l2.next;
            }
            if (l1 == null && l2 == null && carryOver == 0) {
                break;
            }
            listNode.next = new ListNode();
            listNode = listNode.next;
        }
        return first;
    }

    public static void main(String[] args) {
        ListNode ans = new ListNode();

        ListNode l1 = new ListNode(9);
        l1.next = new ListNode();
        l1.next.val = 2;

        ListNode l2 = new ListNode(9);
//        l2.next = new ListNode();
//        l2.next.val = 2;

        AddTwoNumbers addTwoNumbersClass = new AddTwoNumbers();
        System.out.println(addTwoNumbersClass.addTwoNumbers(l1, l2).toString());
    }

}
