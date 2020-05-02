package com.dheerajdac.code.leet.easy;

public class AddBinary {

    public String addBinary(String a, String b) {
        String result = "";

        // Initialize digit sum
        int s = 0;

        // Traverse both strings starting
        // from last characters
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || s == 1)
        {

            // Comput sum of last
            // digits and carry
            s += ((i >= 0)? a.charAt(i) - '0': 0);
            s += ((j >= 0)? b.charAt(j) - '0': 0);

            // If current digit sum is
            // 1 or 3, add 1 to result
            result = (char)(s % 2 + '0') + result;

            // Compute carry
            s /= 2;

            // Move to next digits
            i--; j--;
        }

        return result;
    }

    private String add(String a, String b) {
       return "";
    }

    public char addBits(char a, char b, StringBuilder stringBuilder, int i) {
        if(a == '0' && b =='0'){
            stringBuilder.replace(i, i+1, "0");
            return 0;
        } else if(a == '0' && b =='1') {
            stringBuilder.replace(i, i+1, "1");
            return 0;
        } else if(a == '1' && b =='0') {
            stringBuilder.replace(i, i+1, "1");
            return 0;
        } else {
            stringBuilder.replace(i, i+1, "1");
            return 1;
        }
    }

}
