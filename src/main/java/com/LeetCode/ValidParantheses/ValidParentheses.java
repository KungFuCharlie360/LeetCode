package com.LeetCode.ValidParantheses;

import com.sun.deploy.util.OrderedHashSet;

import java.util.*;

public class ValidParentheses {
    private HashMap<Character, Integer> characters = new HashMap<>();
    private Stack<Character> openCharacters = new Stack<>();
    public boolean isValid(String s) {
        if(s.length()< 2) {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '{' || c == '[' || c == '(') {
                    openCharacters.push(c);
                    continue;
                }
                char poppedElement = openCharacters.empty() ? ' ' : openCharacters.pop();
                switch (c) {
                    case ']':
                        if ('[' == poppedElement) continue;
                        return false;
                    case '}':
                        if ('{' == poppedElement) continue;
                        return false;
                    case ')':
                        if ('(' == poppedElement) continue;
                        return false;
                    default:
                        return false;
                }
            }
            return openCharacters.isEmpty()? true : false;
        }
    }
    public boolean isValidAnyOrder(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (characters.containsKey(c)) {
                characters.put(c, characters.get(c) + 1);
            } else {
                characters.put(c, 0);
            }

        }
        if(     characters.get('{') == characters.get('}') &&
                characters.get('(') == characters.get(')') &&
                characters.get('[') == characters.get(']')) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid(s));
    }
}
