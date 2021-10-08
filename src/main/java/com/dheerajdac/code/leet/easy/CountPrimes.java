package com.dheerajdac.code.leet.easy;

public class CountPrimes {

    public int countPrimes(int n) {
        boolean[] flag = new boolean[n];

        if(n < 3){
            return 0;
        }
        int count = n/2;

        for(int i =3; i*i < n; i+=2){
            if(!flag[i]){
                for(int j = i*i; j<n; j += i*2){
                    if(!flag[j]){
                        count--;
                        flag[j] = true;
                    }
                }

            }
        }
        return count;
    }
    
}
