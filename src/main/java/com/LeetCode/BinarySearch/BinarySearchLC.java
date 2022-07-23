package com.LeetCode.BinarySearch;

/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1


Constraints:

1 <= nums.length <= 104
-104 < nums[i], target < 104
All the integers in nums are unique.
nums is sorted in ascending order.
 */
public class BinarySearchLC {
    public static int search(int[] nums, int target) {
        int flag = 0, min = 0, max = nums.length - 1, half = (min + max) / 2;
        if (nums.length == 0) {
            return -1;
        } else if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        } else {
            while (min <= max) {
                if (nums[half] == target) {
                    return half;
                } else if (nums[half] < target) {
                    min = half + 1;
                    half = (min + max) / 2;
                } else if ((nums[half] > target)) {
                    max = half - 1;
                    half = (min + max) / 2;
                }
            }
            return -1;
        }
    }

    public static int search2(int[] nums, int target) {
        int flag = 0, min = 0, max = nums.length - 1, half = (min + max) / 2;
            while (min <= max) {
                if (nums[half] == target) {
                    return half;
                } else if (nums[half] < target) {
                    min = half + 1;
                    half = (min + max) / 2;
                } else if ((nums[half] > target)) {
                    max = half - 1;
                    half = (min + max) / 2;
                }
            }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3};
        int target = 4;

        System.out.println(BinarySearchLC.search(nums, target));

    }

}
