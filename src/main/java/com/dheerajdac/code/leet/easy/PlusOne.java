package com.dheerajdac.code.leet.easy;

import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int i = digits.length -1 ;
        int overflow = 1;

        while (i >= 0) {
            int temp =  digits[i] +overflow;

            if(temp/10 == 1) {
                temp = temp % 10;
                overflow = 1;
            } else {
                overflow =0;
            }
            digits[i] = temp;
            i--;
        }

        if(overflow == 1) {
            int[] result = new int[digits.length +1];
            result[0] = 1;
            for (int j = 1; j < digits.length + 1; j++) {
                result[j] = digits[j-1];
            }
            return result;
        }
        return digits;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] arr = {9,9,9};
        System.out.println(Arrays.toString(plusOne.plusOne(arr)));
    }
}
