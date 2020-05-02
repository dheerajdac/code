package com.dheerajdac.code.test;// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class kur {


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
        kur t = new kur();
    }

    public int find(int parent[], int index) {

        if (parent[index] == -1) {
            return index;
        }

        if (parent[index] == index) {
            return index;
        }
        return find(parent, parent[index]);
    }

    public void union(int parent[], int src, int des) {
        int x = find(parent, src);
        int y = find(parent, src);

    }

}