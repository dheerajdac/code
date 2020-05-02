package com.dheerajdac.code.test;

public class knapsackDp {




    public static void main(String[] args) {

        int w[] = new int[]{10,20,30};
        int v[] = new int[]{60,100,120};
        int W = 50;


        System.out.println(napsack(W, w, v, v.length));
    }

    private static int napsack(int w, int[] w1, int[] v, int length) {
        int k[][] = new int[length+1][w+1];
        for(int i=0; i<= length; i++){
            for(int j=0; j <= w; j++){
                //System.out.println(i + " " + j);
                if(i==0 || w == 0){
                    k[i][j]= 0;
                }else if( w1[i-1] <= j){
                    k[i][j] = max(v[i-1]+ k[i-1][j-w1[i-1]], k[i-1][j]);
                }else {
                    k[i][j] = k[i-1][j];
                }
            }
        }
        return k[length][w];
    }

    private static int max(int a, int b){
        return a >b ? a :b;
    }
}
