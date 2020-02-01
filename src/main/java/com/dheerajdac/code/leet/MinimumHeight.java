package com.dheerajdac.code.leet;

import java.util.*;
import java.util.function.Function;

public class MinimumHeight {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n == 0){
            return new ArrayList<>();
        }

        if(n == 1){
            Integer[] list = {0};
            return (Arrays.asList(list));
        }

        if(n == 2){
            Integer[] list = {0,1};
            return (Arrays.asList(list));
        }


        Map<Integer, Set<Integer>> map= new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            map.put(i, new HashSet<>());
        }

        for(int[] edge : edges){
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }

        LinkedList<Integer> queue = new LinkedList<>();

        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if(map.get(i).size() == 1){
                queue.add(i);
                visited.add(i);
            }
        }

        int lastNodeInQeue = queue.getLast();
        LinkedList<Integer> result = null;
        while (!queue.isEmpty()){
            Integer node = queue.poll();
            Set<Integer> edgeList = map.get(node);
            edgeList.forEach(value -> {
                map.get(value).remove(value);
                if(!visited.contains(value) && map.get(value).size() == 1) {
                    visited.add(value);
                    queue.add(value);
                }
            });
            if(node == lastNodeInQeue && !queue.isEmpty()){
                lastNodeInQeue = queue.getLast();
                result = new LinkedList<>(queue);
            }
        }

        return new ArrayList<Integer>(result);
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] edges = {{1, 0}, {1, 2}, {1, 3}};
       /*int n = 6;
        int[][] edges = {{0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 4}};*/

        MinimumHeight minimumHeight = new MinimumHeight();
        System.out.println(minimumHeight.findMinHeightTrees(n , edges));
    }
}
