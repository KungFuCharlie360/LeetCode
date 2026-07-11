package com.interview.GeeksForGeeks.arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for(int i = 0;  i < nums.length ; i++) {
            int complement = target - nums[i];
            if( maps.containsKey(complement) && (maps.get(complement) != i ))
                return new int[] { maps.get(complement), i };
            maps.put(nums[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        TwoSum sums = new TwoSum();
        System.out.println(sums.twoSum(new int[] {2,7,11,15}, 9));

    }
}
