package com.dheerajdac.code.aazadi;

public class AddBinary {
    
    public String addBinary(String a, String b) {
        int i = a.length() -1;
        int j = b.length() -1;
        int q = 0;
        StringBuffer buffer = new StringBuffer();

        while (i>= 0 || j>= 0 || q == 0) {
            char x = '0';
            char y = '0';
            if(i>= 0) {
                x = a.charAt(i);
            }
            if(j>= 0){
                y = b.charAt(j);
            }
            int temp = add(x, y, q);
            q = temp/2;
            buffer.append(temp%2);
            i--; j--;
        }
        if(q != 0) buffer.append(q);

        return buffer.reverse().toString();
    }

    public static int add(char x, char y, int q) {
        if(x == '0' && y == '0') {
            return 0 + q;
        } else if(x == '0' && y == '1') {
            return 1 + q;
        } else if(x == '1' && y == '0') {
            return 1 + q;
        } else {
            return 2 + q;
        }
    }
}
