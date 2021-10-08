package com.dheerajdac.code.leet.easy;

import java.util.Map;
import java.util.HashMap;

public class IsomorphicString {

    public boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();


        for(int i= 0; i < s.length(); i++){
            Character fromFirstString = s.charAt(i);
            Character fromSecondString = t.charAt(i);

            if(map.containsKey(fromFirstString) && map2.containsKey(fromSecondString)){
                if(map.get(fromFirstString) != fromSecondString){
                    return false;
                }
            } else {
                if(map.containsKey(fromFirstString) ^ map2.containsKey(fromSecondString)){
                    return false;
                }
                map.put(fromFirstString,fromSecondString);
                map2.put(fromSecondString, fromFirstString);
            }
        }

        return true;
    }
    
}
