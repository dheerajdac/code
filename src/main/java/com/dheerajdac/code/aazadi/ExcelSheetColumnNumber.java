package com.dheerajdac.code.aazadi;

public class ExcelSheetColumnNumber {

    public int titleToNumber(String columnTitle) {
        int number = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int temp = columnTitle.charAt(i) - 'A' + 1;
            number *= 26;
            number += temp;
        }
        return number;
    }


    public static String convertToTitle(int columnNumber) {
        StringBuffer buffer = new StringBuffer();

        while (columnNumber > 0) {
            int temp = (columnNumber-1) % 26;
            buffer.append((char)('A' + temp));
            columnNumber -= 1;
            columnNumber /= 26;
        }
        return buffer.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(26));
    }
    
}
