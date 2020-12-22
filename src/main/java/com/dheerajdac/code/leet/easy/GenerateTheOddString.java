package com.dheerajdac.code.leet.easy;

public class GenerateTheOddString {

    public String generateTheString(int n){
        StringBuilder sb  = new StringBuilder();

        if(n %2 == 0){
            sb.append('b');
        } else {
            sb.append('a');
        }
        for(int i = 1; i < n; i++){
            sb.append('a');
        }

        return sb.toString();

    }
}
