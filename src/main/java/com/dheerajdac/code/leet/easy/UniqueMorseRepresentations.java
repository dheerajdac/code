package com.dheerajdac.code.leet.easy;

import java.util.*;

public class UniqueMorseRepresentations {
    
    public int uniqueMorseRepresentations(String[] words) {
        String[] code  = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> morseWordSet = new HashSet<>();
        int result = 0;
        for(String word : words){
            String mWord = "";
            for(int i = 0; i < word.length(); i++){
                mWord = mWord + code[word.charAt(i) - 'a'];
            }

            if(!morseWordSet.contains(mWord)){
                result++;
                morseWordSet.add(mWord);
            }
        }

        return result;
    }
}
