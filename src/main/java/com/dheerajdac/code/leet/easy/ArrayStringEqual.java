package com.dheerajdac.code.leet.easy;

public class ArrayStringEqual {

    
    public boolean arrayStringAreEqual(String[] word1, String[] word2) {
        int i=0, j=0, x=0 , y=0;
        boolean result = true;
        while(i < word1.length && j < word2.length){
            String first = word1[i];
            String second = word2[j];

            while(x < first.length() && y < second.length()){
               result = first.charAt(x) == second.charAt(y);
               x++;
               y++;
            }

            if(!result){
                break;
            }

            if(x == first.length()){
                x= 0;
                i++;
            }

            if(y == second.length()){
                y =0;
                j++;
            }
            
        }


        return  result && i == word1.length && x == word1[word1.length-1].length() && y == word2[word2.length-1].length() && j == word2.length;
    }
}
