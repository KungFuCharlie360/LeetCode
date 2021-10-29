package com.LeetCode.LongestSubstring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LongestSubstringWithoutRepetition {
    public int lengthOfLongestSubstring(String s) {
        String c;
        int k;
        String longestSubstring = new String();
        StringBuilder builderSubstring = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            c = String.valueOf(s.charAt(i));
            if (builderSubstring.toString().contains(c)) {
                k = builderSubstring.toString().indexOf(c);
                builderSubstring = k > 0 ? builderSubstring.delete(0, k + 1) : builderSubstring.deleteCharAt(0);
                builderSubstring.append(c);
            } else {
                builderSubstring.append(c);
            }
            if (builderSubstring.length() > longestSubstring.length()) {
                longestSubstring = builderSubstring.toString();
            }
        }
        return longestSubstring.length();
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepetition longestSubstringWithoutRepetition = new LongestSubstringWithoutRepetition();
        System.out.println(longestSubstringWithoutRepetition.lengthOfLongestSubstring("ohvhjdml"));
    }
}
