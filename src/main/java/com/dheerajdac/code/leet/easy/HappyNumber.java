package com.dheerajdac.code.leet.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        if(n <=0){
            return false;
        }

        int result = n;
        Set<Integer> set = new HashSet<>();

        while (result != 1){
            int temp = result;
            set.add(result);
            int ans = 0;
            while (temp !=0){
                int rem = temp%10;
                ans = ans + (rem*rem);
                temp = temp /10;
            }
            result = ans;
            if(set.contains(result)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HappyNumber number = new HappyNumber();
        System.out.println(number.isHappy(2));
    }
}
