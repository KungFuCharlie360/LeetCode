package com.practice;
public class SecondSmallestIntegerInArray {
    public int secondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length ; i++) {
            if(arr[i]<smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if(arr[i]<secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args) {
        int[] arr = {-1,12,0};
        SecondSmallestIntegerInArray solution = new SecondSmallestIntegerInArray();
        System.out.println(solution.secondSmallest(arr));
    }
}
