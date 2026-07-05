package com.practice;

public class BreakPalindrome {
    public String breakPalindrome(String palindrome) {
        StringBuilder sb = new StringBuilder(palindrome);
        int tempL = palindrome.length()/2;
        for(int i = 0 ; i<tempL; i++) {
            if(palindrome.charAt(i)>'a') {
                sb.deleteCharAt(i);
                sb.insert(i, 'a');
                return sb.toString();
            }
        }
        for(int i = palindrome.length()-1; i>=tempL; i--) {
            if(palindrome.charAt(i)<='a') {
                sb.deleteCharAt(i);
                sb.insert(i, 'b');
                return sb.toString();
            }
        }
        return palindrome;
    }

    public static void main(String[] args) {
        String str = "aa";
        BreakPalindrome breakPalindrome = new BreakPalindrome();
        breakPalindrome.breakPalindrome(str);
    }
}
