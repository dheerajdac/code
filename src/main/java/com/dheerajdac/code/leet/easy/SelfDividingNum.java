package com.dheerajdac.code.leet.easy;

import java.util.*;

public class SelfDividingNum {

    public List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> result  = new ArrayList<>();

        for(int i = left; i <= right; i++){

            int temp = i;

            for(; temp > 0; temp /=10){
                if((temp%10 == 0) || ( i % (temp%10) == 0) ){
                    break;
                }
            }
            if(temp ==0)
                result.add(i);

        }

        return result;
    }
}
