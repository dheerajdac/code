package com.dheerajdac.code.leet.easy;

public class Maximum69Number {


    public int maximum69Number (int num){
        int result = num;

        int pos = -1;
        int counter = -1;
        while(num != 0){
            int rem = num % 10;
            num = num /10;
            counter++;
            if(rem == 6){
                pos = counter;
            }
        }

        if(pos != -1){
            result += 3* Math.pow(10, pos);
        }

        return result;

        
    }
}
