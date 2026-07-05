package com.practice;

import java.util.LinkedHashMap;

public class CountOccurrencesInString {
    public String countMyDigits(String input) {
        LinkedHashMap<Character,Integer> lMap = new LinkedHashMap<>();
        for(int i = 0 ; i<input.length() ; i++) {
            if(lMap.containsKey(input.charAt(i))) {
                int temp = lMap.get(input.charAt(i))+1;
                lMap.put(input.charAt(i), temp);
            } else {
                lMap.put(input.charAt(i), 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        lMap.forEach((letter,occurrence) -> {
            sb.append(letter);
            sb.append(occurrence);
        });
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "a";
        CountOccurrencesInString solution = new CountOccurrencesInString();
        System.out.println(solution.countMyDigits(str));
    }
}
