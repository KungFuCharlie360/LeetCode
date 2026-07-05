package com.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RemoveDupesOfUnsortedList {
    public ListNode listNode = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(2, null))));

    public static void main(String[] args) {
        RemoveDupesOfUnsortedList removeDupesOfUnsortedList = new RemoveDupesOfUnsortedList();
        System.out.println(removeDupesOfUnsortedList.deleteDuplicatesUnsorted(removeDupesOfUnsortedList.listNode));
    }

    public RemoveDupesOfUnsortedList.ListNode deleteDuplicatesUnsorted(RemoveDupesOfUnsortedList.ListNode head) {
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        while(head != null) {
            if(hashMap.containsKey(head.val)) {
                int temp = hashMap.get(head.val);
                temp++;
                hashMap.put(head.val, temp);
            } else {
                hashMap.put(head.val, 1);
            }
            head = head.next;
        }
        boolean allDuplicate = hashMap.values().stream().allMatch(v -> v>1);
        if(allDuplicate){
            return null;
        }
        ListNode values = new ListNode();
        ListNode result = values;
        ListNode dummy = new ListNode();
        for(Integer val : hashMap.keySet()) {
            if(hashMap.get(val) == 1) {
                values.val = val;
                values.next = new ListNode();
                dummy = values;
                values = values.next;
            }
        }
        dummy.next = null;
        return result;
    }

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
    }
}
