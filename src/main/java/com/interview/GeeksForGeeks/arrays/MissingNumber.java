package com.interview.GeeksForGeeks.arrays;

public class MissingNumber {
    //Find missing number in the array.
    public static int missingNumber(int[] arr) {
        float small = Integer.MAX_VALUE;
        float large = 0;
        float sum = 0;
        for (float element:arr) {
            sum = sum + element;
            if(element<small) {
                small = element;
            } else if(element>large) {
                large = element;
            }
            System.out.println("small: "+small+" large:"+large+" sum:"+sum);
        }
        float actualSum = (large/2)*(small+large);
        System.out.println(actualSum + " " + sum);
        return (int)(actualSum-sum);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7,8,9};
        System.out.println(missingNumber(arr));
    }
}
