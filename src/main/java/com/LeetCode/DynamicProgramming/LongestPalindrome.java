package com.LeetCode.DynamicProgramming;

public class LongestPalindrome {
    /*
    Given a string s, return the longest palindromic substring in s.
    Example 1:

    Input: s = "babad"
    Output: "bab"
    Explanation: "aba" is also a valid answer.
    Example 2:

    Input: s = "cbbd"
    Output: "bb"
     */
    public static String longestPalindrome(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        String window="", longestPalindromeProspect="", longestPalindrome="";
        int start = 0, end = 1;
        int tracker = 0;
        boolean flag = true;
        while (flag == true) {
            window = s.substring(start, end);
            if (reverse.contains(window)) {
                longestPalindromeProspect = window;
                if (new StringBuilder(longestPalindromeProspect).reverse().toString().equals(longestPalindromeProspect)) {
                    longestPalindrome = longestPalindromeProspect;
                }
                end++;
            } else {
                start++;
                end++;
            }
            tracker++;
            if (tracker == s.length()) {
                flag = false;
            }
        }
        return longestPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aacabdkacaa"));
    }
}
