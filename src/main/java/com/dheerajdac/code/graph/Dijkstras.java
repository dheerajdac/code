package com.dheerajdac.code.graph;

public class Dijkstras {





    public static void main(String arg[]){
        int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}};
        findMinimumDistance(graph, 0 ,graph.length);
    }

    private static void findMinimumDistance(int a[][], int start, int n) {
        start = 0;
        boolean[] visited = new boolean[n];

        int[] minDistance = new int[n];

        for (int i = 0; i < n; i++) {
            minDistance[i] = Integer.MAX_VALUE;
        }

        minDistance[start] = 0;


        for (int i = 0; i < n; i++) {
            int u = findMiniItem(visited, minDistance);

            visited[u] = true;


            for (int j = 0; j < n; j++) {
                if(!visited[j] && minDistance[u] < Integer.MAX_VALUE &&
                        a[u][j] != 0 &&
                        minDistance[j] > minDistance[u] + a[u][j] ){
                    minDistance[j] = minDistance[u] + a[u][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(minDistance[i]);
        }

    }

    private static int findMiniItem(boolean[] visited, int[] minDistance) {

        int index = -1;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < minDistance.length; i++) {
            if(!visited[i] && minDistance[i] < min){
                min = minDistance[i];
                index = i;
            }
        }
        return index;
    }
}
