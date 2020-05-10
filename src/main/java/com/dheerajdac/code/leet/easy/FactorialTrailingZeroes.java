package com.dheerajdac.code.leet.easy;

import java.util.HashMap;
import java.util.Map;

//To Do
public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {

        Integer[] arr = new Integer[n+1];

        for (int i = 0; i <= n; i++) {
            arr[i] = -1;
        }

        int i =1;
        while (i <= n){
            int temp = i;
            int twos = 0;
            int fives = 0;

            while (temp % 2 == 0){
                twos++;
                temp = temp/2;
                if(!arr[temp].equals(-1)){
                    twos += arr[temp];
                    break;
                }
            }

            while (temp % 5 ==0){
                fives++;
                temp = temp/5;
                if(!arr[temp].equals(-1)){
                    fives += arr[temp];
                    break;
                }
            }
            arr[i] = Math.min(twos, fives);
            i++;
        }

        return arr[n];
    }

    public static void main(String[] args) {
        FactorialTrailingZeroes zeroes = new FactorialTrailingZeroes();
        System.out.println(zeroes.trailingZeroes(10));
    }

}
