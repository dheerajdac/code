package com.dheerajdac.code.aazadi;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if((c >= 'a' && c<='z') || (c >= 'A' && c<='Z')){
                buffer.append(c);
            }
        }

        System.out.println(buffer.toString());

        return buffer.toString().toLowerCase().equals(buffer.reverse().toString().toLowerCase());
    }
    
}
