package com.dheerajdac.code.leet.easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();

        for(Character c: s.toCharArray()){
            map.putIfAbsent(c, 0);
            map.computeIfPresent(c, (key, value) -> value+1);
        }

        for(Character c: t.toCharArray()){
            if(map.get(c)== null){
                return false;
            }
            map.computeIfPresent(c, (key, value) -> value-1);
        }

        for(Map.Entry<Character, Integer> set : map.entrySet()){
            if(set.getValue() != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagram anagram = new ValidAnagram();
        anagram.isAnagram("anagram",
                "nagaram");
    }
}
