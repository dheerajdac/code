package com.dheerajdac.code.leet.easy;


import java.util.*;

public class DestCity {

    public String destCity(List<List<String>> paths) {
        String result="";

        Set<String> city = new HashSet<>();
        Set<String> citySet = new HashSet<>();

        for(List<String> path : paths){
            city.add(path.get(0));
            citySet.add(path.get(1));
        }

        for(String s : citySet){
            if(!city.contains(s)){
                result = s;
            }
        }

        return result;

    }
}
