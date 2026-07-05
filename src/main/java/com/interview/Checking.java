package com.interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Checking {
    int a;
    int b;

    public Checking(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Checking checking = new Checking(1,2);
        Checking checking1 = new Checking(1, 2);
        Map<Integer,Integer> map = new HashMap<>();

        System.out.println(checking1==checking); //false ›
        System.out.println(checking1.equals(checking)); //false
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        Arrays.stream(arr).boxed().sorted(Comparator.comparing(Integer::bitCount).thenComparing(Function.identity())).mapToInt(Integer::intValue).toArray();
        Queue<Integer> list = new PriorityQueue<Integer>();
        PriorityQueue<Integer> list1 = new PriorityQueue<Integer>();

    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }
        AtomicInteger max = new AtomicInteger(0);
        AtomicInteger second = new AtomicInteger(0);
        map.forEach((key,v) -> {
            if(max.get()<v) {
                max.getAndSet(key);
            } else if(second.get()<v) {
                max.getAndSet(key);
            }
        });
        int[] arr = new int[2];
        arr[0]=max.get();
        arr[1]= second.get();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((p1, p2) -> p1.getValue() - p2.getValue());

        return arr;
    }
}

