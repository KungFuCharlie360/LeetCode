package com.LeetCode.CheckIfWordEqualsSummationOfTwoWords;


import lombok.ToString;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//1880. Check if Word Equals Summation of Two Words
@ToString
public class CheckIfWordEqualsSumOfTwoWords {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        if(sum(firstWord) + sum(secondWord) == sum(targetWord)){
            return true;
        }
        return false;
    }

    public int sum(String str) {
        int sum = 0;
        for(int i = 0; i<str.length();i++){
            char c = str.charAt(i);
            sum = sum*10+((int)c -97);
        }
        return sum;
    }

    public static void main(String[] args) {
        CheckIfWordEqualsSumOfTwoWords checkIfWordEqualsSumOfTwoWords = new CheckIfWordEqualsSumOfTwoWords();
        System.out.println(checkIfWordEqualsSumOfTwoWords.isSumEqual("acb", "cba", "cdb"));
    }
}
