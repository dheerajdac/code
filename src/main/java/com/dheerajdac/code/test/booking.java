package com.dheerajdac.code.test;

import java.util.*;
import java.util.stream.Collectors;

public class booking {

    static class sortTime implements Comparator<List<Integer>> {

        public int compare(List<Integer> m1, List<Integer> m2)
        {
            return m2.get(1) - m1.get(1);
        }
    }

    public static List<Integer> getmultiple(List<List<Integer>> first, List<List<Integer>> second){
        if(first.isEmpty()){
            Collections.sort(second, new sortTime());
            return second.stream().map(k-> k.get(0)).collect(Collectors.toList());
        }

        if(second.isEmpty()){
            return new ArrayList<Integer>();
        }

        Set<Integer> firstSet = first.stream().map(x -> x.get(0)).collect(Collectors.toSet());

        List<List<Integer>> secondList = new ArrayList<>();

        for(List<Integer> ele : second) {
            if(!firstSet.contains(ele.get(0))){
                List<Integer> temp = new ArrayList<>();
                temp.add(ele.get(0));
                temp.add(ele.get(1));
                secondList.add(temp);
            }
        }

        Collections.sort(secondList, new sortTime());
        return secondList.stream().map(k-> k.get(0)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<List<Integer>> first = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1234);
        temp.add(532632);
        first.add(temp);
        List<Integer> temp1 = new ArrayList<>();
        temp1.add(2354);
        temp1.add(732634);
        first.add(temp1);

        List<List<Integer>> second = new ArrayList<>();

        List<Integer> temp3 = new ArrayList<>();
        temp3.add(1234);
        temp3.add(532632);
        second.add(temp3);
        List<Integer> temp4 = new ArrayList<>();
        temp4.add(234);
        temp4.add(632633);
        second.add(temp4);

        List<Integer> temp5 = new ArrayList<>();
        temp5.add(458);
        temp5.add(642633);
        second.add(temp5);

        List<Integer> temp6 = new ArrayList<>();
        temp6.add(2354);
        temp6.add(732634);
        second.add(temp6);


        List<Integer> a = getmultiple(first, second);
        System.out.println(a.get(0));
    }
}