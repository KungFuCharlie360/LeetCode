package com.LeetCode.ArrayManipulation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static long arrayManipulation(int n, List<List<Integer>> queries) {

        long[] weights = new long[n+1];
        final long[] sum = {0};
        queries
                .forEach((query) -> {

            for (int i = query.get(0); i<=query.get(1); i++){
                weights[i] = weights[i] + query.get(2);
                if (sum[0] <weights[i])
                    sum[0] = weights[i];
            }
        });

        return sum[0];

    }
/*
10 4
2 6 8
3 5 7
1 8 1
5 9 15
 */
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(6);
        list1.add(8);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(5);
        list2.add(7);
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(8);
        list3.add(1);
        List<Integer> list4 = new ArrayList<>();
        list3.add(5);
        list3.add(9);
        list3.add(15);
        List<List<Integer>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);

        long maxValue = Result.arrayManipulation(10,list);
    }

}

