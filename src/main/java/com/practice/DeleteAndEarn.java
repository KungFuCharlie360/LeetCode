package com.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        int maxValue = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            if(map.containsKey(num)) {
                int temp = map.get(num);
                map.put(num, temp+1);
            } else {
                map.put(num,1);
            }
        }
        for(Integer key : map.keySet()) {
            Set<Integer> arr = map.keySet();
            int total = 0;
            while(!arr.isEmpty()) {
                int tempKey = arr.stream().findFirst().get();
                total += tempKey * map.get(tempKey);
                arr.remove(tempKey);
                if(arr.contains(tempKey+1)) {
                    arr.remove(tempKey+1);
                }
                if(arr.contains(tempKey-1)) {
                    arr.remove(tempKey-1);
                }
            }
            if(total>maxValue) {
                maxValue = total;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,3,3,4};
        DeleteAndEarn deleteAndEarn = new DeleteAndEarn();
        deleteAndEarn.deleteAndEarn(arr);
    }
}
