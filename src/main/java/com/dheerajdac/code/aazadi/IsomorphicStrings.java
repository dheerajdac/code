package com.dheerajdac.code.aazadi;

import java.util.*;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if(!set.contains(t.charAt(i))){
                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            Character temp = map.get(s.charAt(i));
            if(temp == null || t.charAt(i) != temp) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
    }
    
}
