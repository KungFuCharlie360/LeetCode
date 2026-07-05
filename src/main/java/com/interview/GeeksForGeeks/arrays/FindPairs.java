package com.interview.GeeksForGeeks.arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindPairs {
    public boolean findPair(int arr[], int size, int n)
    {
        HashSet<Integer> set = new LinkedHashSet<>();
        for(int i = 0; i<size ; i++) {
            if(arr[i]>=n) {
                int temp = arr[i] - n;
                if(set.contains(temp)) {
                    return true;
                } else {
                    set.add(arr[i]);
                }
            }else {
                int temp = arr[i] + n;
                if(set.contains(temp)) {
                    return true;
                } else {
                    set.add(arr[i]);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {6067,7866,3614,478,5375,3992,41,1337,7821,5987,1602,5229,668,2990,7918,6334,9109,3542,5188,8818,3330,8081,5464,8693,6460,8909,7790,7389,1887,4921,9497,7953,9138,9462,4782,4512,9805,4823,5849,7626,7161,7450,9206,7828,6791,7123,513,5899,7017,2053,1069,346,133,2884,5391,2944,1792,3180,6684,30,4452,6180,4335,3589,1994,5468,4453,1798,290,301,5775,3803,4102,4981,1630,7245,8455,8495,9495,5471,547,563,2169,7031,9799,7559,6326,1590,738,3009,7972,1541,5541,2306,5129,7534,4125,9581,5683,4415,6233,1458,8217,6687,2790,6198,3931,1244,1044,3425,6715,7942,340,8883,1324,138,2793,7649,8079,9882,7010,2402,1422,2550,4707,2902,6435,5184,8835,8469,9598,1419};
        int n = 108;
        int size = 132;
        FindPairs findPairs = new FindPairs();
        findPairs.findPair(arr,size,n);
    }
}
