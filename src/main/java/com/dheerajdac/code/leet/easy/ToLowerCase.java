package com.dheerajdac.code.leet.easy;

public class ToLowerCase {
    
    public String toLowerCase(String str) {
        int diff = 'a' - 'A';

        StringBuilder builder = new StringBuilder(str.length());

        for(int i = 0; i <= str.length(); i++) {
            char temp = str.charAt(i);

            if(temp >= 'A' && temp <= 'Z'){
                builder.append((char)(diff - temp));
            } else {
                builder.append(temp);
            }
        }

        return builder.toString();

    }
}
