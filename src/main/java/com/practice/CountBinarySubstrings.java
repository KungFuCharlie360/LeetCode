package com.practice;

public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int zero = s.indexOf("0")==-1?s.length():s.indexOf("0");
        int one = s.indexOf("1")==-1?s.length():s.indexOf("1");
        int count = 0;
        int i = 0;
        int cz,co;
        while(i<s.length()){
            if(zero<one) {
                cz = one-zero;
                zero = s.indexOf("0",one)==-1?s.length():s.indexOf("0",one);
                co = zero-one;
                count+=Math.min(co,cz);
            } else {
                co = zero-one;
                one = s.indexOf("1",zero)==-1?s.length():s.indexOf("1",zero);
                cz = one-zero;
                count+=Math.min(co,cz);
            }
            i = Math.max(one,zero);
        }
        return count;
    }

    public static void main(String[] args) {
        CountBinarySubstrings countBinarySubstrings = new CountBinarySubstrings();
        countBinarySubstrings.countBinarySubstrings("00");
    }
}
