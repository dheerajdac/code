package com.dheerajdac.code.leet.easy;

/*
/palindrome-number/
*/


public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int original = x;
        int result = 0;
        while (x != 0){
            int pop = x % 10;
            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && pop > 7)) {
                return false;
            }
            result = result * 10 + pop;
            x = x / 10;
        }

        return original == result;

    }

}
