package com.dheerajdac.code.leet.easy;

public class ReverseWordsInAString3 {
    
    public String reverseWords(String s){

        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word : arr){
            StringBuilder builder = new StringBuilder(word);
            result.append(builder.reverse());
            result.append(" ");
        }

        result.deleteCharAt(s.length());

        return result.toString();
    }
}
