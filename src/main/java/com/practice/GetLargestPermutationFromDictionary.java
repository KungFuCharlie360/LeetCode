package com.practice;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class GetLargestPermutationFromDictionary {
    public static void main(String[] args) {
        String[] dictionary = {"to", "banana", "toe", "dogs", "ababcd", "elephant"};
        GetLargestPermutationFromDictionary getLargestPermutationFromDictionary = new GetLargestPermutationFromDictionary();
        System.out.println(getLargestPermutationFromDictionary.getLargePermutation(dictionary, "ogtdes"));
    }

    public String getLargePermutation(String[] dictionary, String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        String largestWord = "";
        int largestWordCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i))) {
                int temp = map.get(input.charAt(i)) + 1;
                map.put(input.charAt(i), temp);
            } else {
                map.put(input.charAt(i), 1);
            }
        }
        for (String word : dictionary) {
            HashMap<Character, Integer> mapWord = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                if (mapWord.containsKey(word.charAt(i))) {
                    int temp = mapWord.get(word.charAt(i)) + 1;
                    mapWord.put(word.charAt(i), temp);
                } else {
                    mapWord.put(word.charAt(i), 1);
                }
            }
            AtomicInteger a = new AtomicInteger(0);
            map.forEach((letter, occurrence) -> {
                if (mapWord.containsKey(letter)) {
                    if (mapWord.get(letter).equals(map.get(letter)))
                        a.incrementAndGet();
                }
            });
            if (a.get() > largestWordCount) {
                largestWordCount = a.get();
                largestWord = word;
            }
        }

        return largestWord;
    }
}
