package com.interview.GeeksForGeeks.arrays;

public class SmallestLargest {
    public static void smallestLargestInArray(int[] arr) {
        int small = Integer.MAX_VALUE;
        int large = 0;
        for (int element:arr) {
            if(element<small) {
                small = element;
            } else if(element>large) {
                large = element;
            }
        }
        System.out.println(small + " " + large);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,89,90};
        smallestLargestInArray(arr);
    }
}
