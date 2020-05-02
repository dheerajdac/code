package com.dheerajdac.code.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MetroCities {


    public static void cities(int[] T){


        List<List<Integer>> adjlist = new ArrayList<>();
        int[] level = new int[T.length];
        int[] ans = new int[T.length-1];

        for (int i = 0; i < T.length; i++) {
            adjlist.add(new ArrayList<>());
            level[i]=0;
        }

        int central =-1 ;

        for (int i = 0; i < T.length; i++) {
            if(T[i] == i )
                central = i;
            else
                adjlist.get(T[i]).add(i);
        }

        LinkedList<Integer> queue = new LinkedList<>();

        for(Integer i : adjlist.get(central)){
            level[i] = 1;
            ans[level[i]-1] = ++ans[level[i]-1];
            queue.add(i);
        }

        while (!queue.isEmpty()){
            Integer a = queue.removeFirst();
            for(Integer i : adjlist.get(a)){
                level[i] = level[a]+1;
                queue.add(i);
                ans[level[i]-1] = ++ans[level[i]-1];
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

    public static void main(String args[]){
        int[] A = {9,1,4,9,0,4,8,9,0,1};
        int[] B = {1,1,1,1,1,1,1,1,1,1};
        cities(A);
        cities(B);
    }

}
