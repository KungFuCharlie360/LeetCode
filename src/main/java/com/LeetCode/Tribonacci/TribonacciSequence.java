package com.LeetCode.Tribonacci;

public class TribonacciSequence {
    public int tribonacci(int n) {
        //Recursive Method
    /*
        if (n ==1 || n== 2)
            return 1;
        else if(n==0)
            return 0;
        else
            return tribonacci(n - 1) + tribonacci(n - 2)+ tribonacci(n - 3);
     */
        //Loop method
        int[] arr = new int[50];
        arr[0]=0;
        arr[1]=1;
        arr[2]=1;
        for(int i = 3 ; i<=n ;i++){
            arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        TribonacciSequence tribonacciSequence = new TribonacciSequence();
        System.out.println(tribonacciSequence.tribonacci(4));
    }
}
