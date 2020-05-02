package com.dheerajdac.code.test;

public class Largest_continous_sum {

    public static int find_sum(int a[]){

        int max_so_far= Integer.MIN_VALUE;
        int max_till_now = 0;

        for(int i=0; i< a.length ; i++) {
            max_till_now = max_till_now + a[i];

            if(max_so_far < max_till_now){
                max_so_far = max_till_now;
            }
            if(max_till_now < 0){
                max_till_now = 0;
            }
        }
        return max_so_far;
    }


    public static  void main(String args[]){
        int [] a = {-2, -3, 5, -1, -2, 1, 5, -3};

        System.out.println(find_sum(a));
    }
}
