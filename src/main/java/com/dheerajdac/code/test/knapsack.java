package com.dheerajdac.code.test;

public class knapsack {




    public static void main(String[] args) {

        int w[] = new int[]{10,20,30};
        int v[] = new int[]{60,100,120};
        int W = 50;

        System.out.println(napsack(W, w, v, v.length));
    }

    private static int napsack(int w, int[] w1, int[] v, int length) {

        if(length == 0 || w ==0){
            return 0;
        }

        if(w1[length-1]> w){
            return napsack(w, w1, v, length-1);
        }else{
            int temp = v[length-1]+ napsack(w-w1[length-1], w1, v, length-1);
            int temp1 = napsack(w, w1, v, length-1);
            if(temp > temp1){
                return temp;
            }else {
                return temp1;
            }
        }

    }
}
