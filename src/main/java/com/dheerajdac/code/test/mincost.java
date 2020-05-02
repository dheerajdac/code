package com.dheerajdac.code.test;

public class mincost {




    public static void main(String[] args) {

        int k[][] = new int[][] {{1,2,3},{4,8,2},{1,5,3}};
        System.out.println(minCost(k,3,3));

    }

    private static int minCost(int k[][], int height, int width){
        int min[][] = new int[height+1][width+1];
        for(int i=0; i<= height; i++){
            for(int j=0; j<=width; j++){
               // System.out.println(i + " " + j);
                if(i==0 && j ==0){
                    min[i][j]=k[i][j];
                }else if(i==0){
                    min[i][j]= k[i][j-1]+min[i][j-1];
                }else if(j == 0){
                    min[i][j]= k[i-1][j]+min[i-1][j];
                }
                else{
                    min[i][j] = k[i-1][j-1]+ minimum(min[i-1][j-1], min[i-1][j], min[i][j-1]);
                }
            }
        }
        return min[height][width];
    }

    private static int minimum(int a, int b , int c){
        if(a <= b && a <= c){
            return a;
        }
        if(b <= a && b <= c){
            return b;
        }
        return c;
    }
}
