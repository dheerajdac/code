package com.dheerajdac.code.leet.easy;


/*
longest-palindrome
*/

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer > map = new HashMap<>(52);

        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == null){
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }

        boolean isSinglePresent = false;
        int result = 0;
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            if(characterIntegerEntry.getValue() % 2 == 0){
                result = result + characterIntegerEntry.getValue();
            } else {
                result = result + characterIntegerEntry.getValue() -1;
                isSinglePresent = true;
            }
        }

        return isSinglePresent ? result + 1 : result;

    }

    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome.longestPalindrome("abccccdd"));
    }
}
