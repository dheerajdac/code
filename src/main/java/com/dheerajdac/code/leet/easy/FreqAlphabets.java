package com.dheerajdac.code.leet.easy;

public class FreqAlphabets {

    public void add(StringBuilder sb, int i){
        sb.append((char)(i - 1 + 'a'));

    }

    public String freqAlphabets(String s) {
        

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i ++){
            
            if(i+2 < s.length() && s.charAt(i+2)== '#'){
                this.add(sb, Integer.parseInt(String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1)))); 
                i += 2;
            } else {
                this.add(sb, Integer.parseInt(String.valueOf(s.charAt(i))));
            }

        }

        return sb.toString();
    }       
}
