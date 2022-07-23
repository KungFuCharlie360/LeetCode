package com.interview.GeeksForGeeks.Strings;

public class Atoi {
    /*
    Complete the function atoi() which takes a string as input parameter and returns integer value of it.
    if the input string is not a numerical string then returns -1.

    Expected Time Complexity: O(|S|), |S| = length of string str.
    Expected Auxiliary Space: O(1)

    Constraints:
    1 ≤ length of S ≤ 10
     */

    public static int atoi(String str) {
        if(str.matches(".*[a-zA-Z!@#$%^&*()_+={}\\[\\].<>~`].*") || str.contains("--"))
            return -1;
        else if(str.isEmpty())
            return 0;
        else
            return Integer.parseInt(str);
    }


    public static void main(String[] args) {
        System.out.println(atoi("-12"));
    }

}
