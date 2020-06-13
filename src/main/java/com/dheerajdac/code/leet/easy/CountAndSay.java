package com.dheerajdac.code.leet.easy;
/*
count-and-say
*/

public class CountAndSay {

    public String generate(String value){
        StringBuilder result = new StringBuilder();
        int i =0;
        while (i < value.length()) {
            int times = 0;
            while(true){
                if(value.length() > i+1 && value.charAt(i) == value.charAt(i+1)){
                    times++;
                    i++;
                } else {
                    result.append(times+1).append(value.charAt(i));
                    break;
                }
            }
            i++;
        }
        return result.toString();
    }

    public String countAndSay(int n) {

        String value = "1";
        for (int i = 1; i < n; i++) {
            value = generate(value);
        }
        return value;
    }

    public static void main(String[] args) {
        CountAndSay obj = new CountAndSay();
        obj.countAndSay(6);
    }

}
