package com.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Misc {
    //Write a java program to check if two Strings are anagram in java?
    public static boolean anagramWords(String s1, String s2) {
        //bad solution lol wtf
        Map<Object, Long> s1Occurences = Arrays.stream(s1.split("")).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(s1Occurences.toString());
        Map<Object, Long> s2Occurences = Arrays.stream(s2.split("")).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(s2Occurences.toString());
        Map<Object, Boolean> verifyEqual = s1Occurences.entrySet().stream().collect(Collectors.toMap(m -> m.getKey(), m -> m.getValue().equals(s2Occurences.get(m.getKey()))));
        System.out.println(verifyEqual.toString());
        return verifyEqual.get(0);
    }

    public static boolean anagramWordsWithString(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        char[] s1Sorted = s1.toCharArray();
        char[] s2Sorted = s2.toCharArray();

        Arrays.sort(s1Sorted);
        Arrays.sort(s2Sorted);

        return Arrays.equals(s1Sorted, s2Sorted);
    }
/*
    //Write a program to check if String has all unique characters in java?
    public static void uniqueString(String str) {
        AtomicInteger flag = new AtomicInteger();
        Map<Object, Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        map.entrySet()
                .stream()
                .forEach(m -> {
            if(m.getValue() != 1)
                flag.set(0);
        });
    });
    }
*/
    public static void main(String[] args) {
        System.out.println(anagramWordsWithString("", ""));
    }
}
