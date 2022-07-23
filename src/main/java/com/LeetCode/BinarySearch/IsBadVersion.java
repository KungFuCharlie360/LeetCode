package com.LeetCode.BinarySearch;

public class IsBadVersion {
    public static boolean isBadVersion(int n) {
        if (n >= 1702766719) {
            return true;
        }
        return false;
    }

    public static int firstBadVersion(int n) {
        int m = 0;
        int start = 0;
        int last = n;
        while (start <= last) {
            int mid = start + (last - start) / 2;
            if (isBadVersion(mid)) {
                m = mid;
                last = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(2126753390));
    }
}
