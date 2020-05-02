package com.dheerajdac.code.test;

public class SprialMatrix {


    static void print(int a[][]){
        int row_start = 0;
        int row_end = a.length;
        int col_start = a[0].length;
        int col_end =0;

        while (row_start<row_end && col_end < col_start) {


            for (int i = row_start; i < col_start - 1; i++) {
                System.out.println("a"+a[row_start][i]);
            }
            row_start++;

            for (int i = row_start - 1; i < row_end - 1; i++) {
                System.out.println("b"+a[i][col_start - 1]);
            }
            col_start--;

            for (int i = col_start; i > col_end; i--) {
                System.out.println("c" +a[row_end - 1][i]);
            }
            row_end--;

            for (int i = row_end; i > row_start-1; i--) {
                System.out.println("d" + a[i][col_end]);
            }

            col_end++;

        }


    }


    public static void main(String[] args) {
        int[][] a = {   {1,2,3,4,17},
                        {5,6,7,8,18},
                        {9,10,11,12,19},
                        {13,14,15,16,20}};
        print(a);
    }

}
