package com.LeetCode.BinarySearch;

public class LeetCode34 {
    /*
    34. Find First and Last Position of Element in Sorted Array
Medium

10849

298

Add to List

Share
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.


     */

    public int[] searchRange(int[] nums, int target) {
        int range1=-1,range2=-1;
        int start = 0;
        int end = nums.length;
        int mid = (start + end )/2;
        while (start < end) {
            System.out.println("start: "+ start+" mid:"+mid+" end:"+end+" range1: "+range1+" range2:"+range2);
            if(target > nums[mid] ){
                start = mid;
            } else if(target < nums[mid]) {
                end = mid;
            } else {
               range1 = (range1==-1)?mid:range1;
               range2 = (range1==-1)?mid:range1+1;
            }
        }
        return new int[]{range1,range2};
    }

    public static void main(String[] args) {
        LeetCode34 leetCode34 = new LeetCode34();
        int[] num =new int[]{1};
        leetCode34.searchRange(num,1);
    }
}
