package com.interview.GeeksForGeeks.Strings;

import java.util.regex.Pattern;

public class ReverseWords {
    /*
    Given a String S, reverse the string without reversing its individual words. Words are separated by dots.
    Example 1:

    Input:
    S = i.like.this.program.very.much
    Output: much.very.program.this.like.i
    Explanation: After reversing the whole
    string(not individual words), the input
    string becomes
    much.very.program.this.like.i
     */
    public static String reverseWords(String str) {
        String[] split = str.split("[.]");
        String reversed = "";
        for( int i = split.length-1 ; i>0 ;i--){
            reversed = reversed + split[i] +".";
        }
        return reversed+split[0];
    }
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        System.out.println(reverseWords(str));
    }
}
