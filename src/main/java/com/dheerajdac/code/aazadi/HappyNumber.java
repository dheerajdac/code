package com.dheerajdac.code.aazadi;

import java.util.*;

public class HappyNumber {


    public static boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        Set<Integer> set = new HashSet<>();

        

        while(n != 1){
            
            int sum = 0;
            while(n != 0) {
                int temp = n%10;
                sum += ( temp * temp);
                n = n/10;
            }
            if(set.contains(sum)){
                break;
            }
            set.add(sum);
            n = sum;
        }
        return n == 1;
    }


    public static void main(String[] args) {
        System.out.println(isHappy(19));

        System.out.println(isHappy(2));System.out.println(isHappy(7));
    }
    
}
