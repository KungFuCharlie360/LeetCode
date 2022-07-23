package com.interview.GeeksForGeeks.arrays;

public class SecondLargest {
    //Find second largest number in an array
    public static void main(String[] args) {
        int arr1[] = {10, 2, 3, 40, 5, 6, 7, 8, 9};
        int arr[] = {1,2};
        System.out.println(secondLargest(arr));
    }

    private static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        if(arr.length<2){
            return 0;
        }
        for (int element : arr) {
            if (element > largest) {
                secondLargest = largest;
                largest = element;
            } else if(element < largest && element > secondLargest){
                secondLargest = element;
            }
        }
        return secondLargest;
    }
}
