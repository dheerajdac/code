package com.dheerajdac.code.leet.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    //abcabcbb

    public int lengthOfLongestSubstring(String s) {

        if(s == null || s.isEmpty()){
            return 0;
        }

        int longestTillNow = 0;
        int newLongest = 0;

        Set<Character> set = new HashSet<>(128);
        HashMap<Character, Integer> map= new HashMap<>();

        char[] characters = s.toCharArray();
        int lastPointer = -1;
        int i = 0;
        while (i < characters.length) {
            Character temp = characters[i];
            if(set.contains(temp)){
                int lastPosition = map.get(temp);
                map.put(temp, i);
                if(lastPointer <= lastPosition){
                    newLongest = i - lastPosition;
                    lastPointer = lastPosition;
                } else {
                    newLongest++;
                }
            } else {
                set.add(temp);
                map.put(temp, i);
                newLongest++;
            }
            if(newLongest > longestTillNow){
                longestTillNow = newLongest;
            }
            i++;
        }

        return longestTillNow;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters characters = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(characters.lengthOfLongestSubstring("abcabcbb"));
    }
}
