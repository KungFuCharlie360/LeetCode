package com.interview.GeeksForGeeks.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountOfSubStringsWithEqualConsecutiveZeroesAndOnes {
    public int[] reverse(int[] arr){
        int[] reversedArray = new int[arr.length];
        for(int i=0,j=arr.length;i<arr.length && j>0;i++,j--) {
            reversedArray[j]=arr[i];
        }
        return reversedArray;
    }
    public int countSubstring(String binary) {
        int consecutiveValue = 1;
        ArrayList<Integer> consecutive = new ArrayList<>();
        if(binary.length()==1){
            return 0;
        }

        for(int i = 0; i < binary.length()-1; i++) {
            char current = binary.charAt(i);
            char next = binary.charAt(i+1);
            System.out.println(current + " "+next+ " "+consecutiveValue);
            if(current != next ){
                consecutive.add(consecutiveValue);
                consecutiveValue = 1;
            } else {
                consecutiveValue++;
            }
        }
        consecutive.add(binary.charAt(binary.length()-1)==binary.charAt(binary.length()-2)?consecutiveValue:1);
        System.out.println(Arrays.toString(new ArrayList[]{consecutive}));
        int sum = 0;
        for(int i = 0 ; i < consecutive.size()-1 ; i++ ) {
            sum+=(consecutive.get(i)<consecutive.get(i+1))?consecutive.get(i):consecutive.get(i+1);
        }
    return sum;
    }

    public static void main(String[] args) {
        CountOfSubStringsWithEqualConsecutiveZeroesAndOnes count = new CountOfSubStringsWithEqualConsecutiveZeroesAndOnes();
        System.out.println(count.countSubstring("0001110010"));
    }
}
