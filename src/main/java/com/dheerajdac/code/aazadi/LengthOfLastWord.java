package com.dheerajdac.code.aazadi;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int i = 0;
        for (i = s.length() -1; i >= 0; i--) {
            if(s.charAt(i) != ' '){
                break;
            }
        }
        int temp = i;

        for (; i >= 0 ; i--) {
            if(s.charAt(i) == ' ') {
                break;
            }
        }
        return temp - i;
    }
    
}
