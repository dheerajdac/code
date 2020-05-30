package com.dheerajdac.code.leet.medium;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {

            char[] chars = str.toCharArray();

            Arrays.sort(chars);

            String temp = new String(chars);

            map.putIfAbsent(temp, new ArrayList<>());

            map.computeIfPresent(temp, (key, value) -> {
                value.add(str);
                return value;
            });
        }

        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        GroupAnagrams anagrams = new GroupAnagrams();
        anagrams.groupAnagrams(strs);
    }

}
