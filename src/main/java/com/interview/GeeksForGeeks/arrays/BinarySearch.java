package com.interview.GeeksForGeeks.arrays;

public class BinarySearch {
    //Search an element in rotated and sorted array
    public static int sort(int[] nums, int target) {
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
        int arr[] = {1,2,3,5,6,7,8,9};
        System.out.println(sort(arr,4));
    }
}
