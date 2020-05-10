package com.dheerajdac.code.leet.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();

        if(numRows == 0){
            return lists;
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        lists.add(list);
        if(numRows == 1){
            return lists;
        }

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        lists.add(list1);
        if(numRows == 2){
            return lists;
        }

        int i = 3;
        while (i <= numRows){
            List<Integer> previousList = lists.get(i-2);
            List<Integer> newList = new ArrayList<>(3);
            newList.add(1);
            for (int j = 1; j < previousList.size(); j++) {
                newList.add(previousList.get(j-1)+previousList.get(j));
            }
            newList.add(1);
            lists.add(newList);
            i++;
        }
        return lists;
    }
}
