package com.practice;

public class FindMatchingPairs {
    public int numPairsDivisibleBy60(int[] time) {
      /*  //O(n^2)
        int duration = 0;
        for(int i = 0 ; i < time.length ; i++) {
            for(int j = i+1; j<time.length ; j++ ) {
                if((time[i]+time[j])%60==0){
                    duration++;
                }
            }
        }
        return duration;
      */
        int count = 0;
        int[] rem = new int[60];
        for (int i : time) {
            if (i % 60 == 0) {
                count += rem[0];
            } else {
                count += rem[60 - i % 60];
            }
            rem[i % 60]++;
        }
        return count;
    }
}

