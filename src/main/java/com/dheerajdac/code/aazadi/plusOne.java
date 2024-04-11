package com.dheerajdac.code.aazadi;

public class plusOne {
    
    public int[] plusOne(int[] digits) {
        
        int q = 1;
        for (int i = digits.length -1 ; i >= 0; i--) {
            int temp = digits[i] + q;
            q = temp/10;
            digits[i] = temp%10;
        }

        if(q == 0) {
            return digits;
        } else {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1; i < digits.length; i++) {
                result[i] = digits[i-1];
            }
            return result;
        }
    }

}
