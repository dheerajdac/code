package com.dheerajdac.code.leet.easy;

public class XorOperationInAnArray {

    public int secondOperation(int n , int start) {

        if(n % 2 == 0){
            return n/2;
        } else {
            return n/2 ^ (start + n - 1);
        }
    }

    public int firstOpreation(int n, int start){
        if(start % 2 == 1){
            return (start-1) ^ secondOperation(n+1, start-1);
        } else {
            return secondOperation(n, start);
        }
    }

    public int xorOperation(int n, int start) {
        int result = firstOpreation(n, start/2);
        
        result <<= 1;

        if(start % 2 ==1 && n % 2 == 1){
            result += 1;
        }

        return result;
    }

}
