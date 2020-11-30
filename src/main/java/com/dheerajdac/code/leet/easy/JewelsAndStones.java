package com.dheerajdac.code.leet.easy;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones{

    public int newJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        int result = 0;
        for(int i=0; i<J.length(); i++) {
            set.add(J.charAt(i));

        }
        for(int i=0; i < S.length(); i++)
            if(set.contains(S.charAt(i))){
                result++;
            }
        return result;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] arr = {2, 7, 11, 15};
        int[] result = twoSum.twoSum(arr,9);
        System.out.println(result[0] +  "  " + result[1]);
    }

}
