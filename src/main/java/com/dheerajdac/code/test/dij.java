package com.dheerajdac.code.test;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class dij {


    public static void main(String args[]) throws Exception {
        int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        dij t = new dij();
        t.dijkstra(graph, 0);
    }

    private void dijkstra(int[][] graph, int i) {
        int dis[] = new int[9];
        boolean spe[] = new boolean[9];

        for (int j = 0; j < 9; j++) {
            dis[j] = Integer.MAX_VALUE;
            spe[j] = false;
        }

        dis[0] = 0;


        for (int j = 0; j < 8; j++) {
            int u = mini(dis, spe);

            spe[u] = true;

            for (int k = 0; k < 9; k++) {
                if (!spe[k] && dis[u] != Integer.MAX_VALUE && graph[u][k] != 0 && dis[k] > dis[u] + graph[u][k]) {
                    dis[k] = dis[u] + graph[u][k];
                }
            }
        }

        for (int j = 0; j < 9; j++) {
            System.out.println(dis[j]);
        }
    }

    private int mini(int[] dis, boolean[] spe) {
        int mini = Integer.MAX_VALUE, minivalue = -1;
        for (int i = 0; i < 9; i++) {
            if (!spe[i] && mini >= dis[i]) {
                mini = dis[i];
                minivalue = i;
            }
        }

        return minivalue;
    }

}