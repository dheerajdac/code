package com.dheerajdac.code.leet.easy;

public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {

        if(s == null || s.isEmpty()){
            return 0;
        }
        char[] arr = s.toCharArray();

        int y = 0;
        int result = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            char c = arr[i];

            result += (c-'A' +1)*Math.pow(26.0, y);
            y++;
        }
        return result;
    }

}
