package com.interview.GeeksForGeeks.Strings;

import java.util.regex.Pattern;

public class ValidIPAddress {
    public static boolean isValid(String str) {
        if(str.substring(str.length()-1).equals("."))
            return false;
        if( str.matches(".*[a-zA-Z].*"))
            return false;
        String[] ips = str.split("[.]");
        boolean flag = true;
        if (ips.length != 4) {
            return false;
        } else if (ips.length == 0) {
            return false;
        }
        for (String ip : ips) {
            if (ip.isEmpty())
                return false;
            if (ip.length() > 3)
                return false;
            if (ip.length() >= 3 && Integer.parseInt(ip) < 100)
                return false;
            if (Integer.parseInt(ip) > 255)
                return false;
            if (ip.length() >= 2 && Integer.parseInt(ip) < 10)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "a.b.c.d";
        System.out.println(isValid(str));
    }
}
