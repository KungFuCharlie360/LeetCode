package com.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode removeIfValueOfN(ListNode head, int n) {
        ListNode listNodeCurrent = head;
        ListNode listNodeNext = head.next;

        if (head.val == n) {
            return head.next;
        }

        while (listNodeNext != null) {
            if (listNodeNext.val == n) {
                listNodeCurrent.next = listNodeNext.next;
            }
            listNodeCurrent = listNodeNext;
            listNodeNext = listNodeNext.next;
        }
        return head;
    }

    public ListNode removeNthFromBeginning(ListNode head, int n) {
        int flag = 0;
        ListNode listNodeCurrent = head;
        ListNode listNodeNext = head.next;
        if (head.next == null && flag == n) {
            return new ListNode();
        }
        while (listNodeNext != null) {
            if (flag == n) {
                listNodeCurrent.next = listNodeNext.next;
            }
            listNodeCurrent = listNodeNext;
            listNodeNext = listNodeNext.next;
            flag++;
        }
        return head;
    }

    private ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode listNodeCurrent = head;
        ListNode listNodeNext = head.next;
        int flag = 1;
        Map<Integer, ListNode> listNodes = new HashMap<>();
        while (listNodeNext != null ) {
            listNodes.put(flag, listNodeCurrent);
            flag++;
            listNodeCurrent = listNodeNext;
            listNodeNext = listNodeCurrent.next;
        }
        System.out.println(flag + " " + n);
        switch (flag) {
            case 1:
                return null;
            case 2:
                return n == 1 ? new ListNode(listNodes.get(n).val, null):new ListNode(listNodes.get(flag).val,null);
            default:
                listNodes.get(flag - n).next = listNodes.get(flag - n + 1).next;
                return head;
        }

    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        ListNode l1 = new ListNode(1, null);
 /*       ListNode l2 = new ListNode(2, l1);
        ListNode l3 = new ListNode(4, l2);
        ListNode l4 = new ListNode(6, l3);*/
        ListNode l5 = new ListNode(7, l1);
        ListNode lFinal = listNode.removeNthFromEnd(l5, 4);

        while (lFinal.next != null) {
            System.out.println(lFinal.val);
            lFinal = lFinal.next;
        }
    }


}

