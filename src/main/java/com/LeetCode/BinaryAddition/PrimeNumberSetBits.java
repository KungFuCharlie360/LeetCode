package com.LeetCode.BinaryAddition;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class PrimeNumberSetBits {
    public int countPrimeSetBits(int left, int right) {
        System.out.println("Numbers are " + left + " and "+ right);
        int[] numbers = IntStream.range(left,right+1).toArray();
        AtomicInteger count = new AtomicInteger();
        Arrays.stream(numbers).forEach((number) -> {
            System.out.println("The number is "+ number);
            System.out.println("The prime count "+count);
            System.out.println("Prime "+ isPrime(Integer.bitCount(number)));
            if(isPrime(Integer.bitCount(number))) {
                count.getAndIncrement();
            }
        });
        return count.get();
    }

    public boolean isPrime(int num) {
        if (num<2) {
            return false;
        }

        for(int i = 2; i<=Math.sqrt(num); i++) {
            System.out.println(" i:"+i+" num:"+num);
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumberSetBits primeNumberSetBits = new PrimeNumberSetBits();
        System.out.println(primeNumberSetBits.countPrimeSetBits(10,15));
    }
}