package com.LeetCode.arrayPermutation;

import java.util.Arrays;
class Solution {
    public int[] swap(int[] arr, int index1, int index2) {
        int temp;
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;
    }
    public int[] reverse(int[] arr){
        int[] reversedArray = new int[arr.length];
        for(int i=0, j=arr.length-1;i<arr.length &&j>=0;i++,j--) {
            reversedArray[j]=arr[i];
        }
        return reversedArray;
    }

    public void printArray(int[] nums){
        System.out.print("[");
        for(int i=0;i<nums.length-1;i++){
            System.out.print(nums[i]+",");
        }
        System.out.print(nums[nums.length-1]);
        System.out.print("]");
    }
    public void nextPermutation(int[] nums) {
        boolean flag=true;
        if(nums.length<=1){
            System.out.println(Arrays.toString(nums));
            flag=false;
        }
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1] && flag==true){
                printArray(swap(nums,i,i-1));
                flag=false;
            }
        }
        if(flag==true){
            printArray(reverse(nums));
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,4,2};
        Solution solution = new Solution();
        solution.nextPermutation(arr);
    }
}
