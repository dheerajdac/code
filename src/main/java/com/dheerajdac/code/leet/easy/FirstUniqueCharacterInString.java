package com.dheerajdac.code.leet.easy;

import java.util.*;

public class FirstUniqueCharacterInString {

    public int firstUniqChar(String s) {

        if(s == null || s.isEmpty()){
            return -1;
        }
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        char[] arr = s.toCharArray();

        for(Character c: s.toCharArray()){
            map.putIfAbsent(c, 0);
            map.computeIfPresent(c, (k,v) -> v+1 );
        }

        for (int i = 0; i < arr.length; i++) {
            int value = map.get(arr[i]);
            if(value == 1){
                return i;
            }
        }

        return -1;
    }
}
