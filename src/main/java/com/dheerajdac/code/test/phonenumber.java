package com.dheerajdac.code.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phonenumber {


    static String Phonenumber(String text) {
        Pattern p1 = Pattern.compile("[0-9]{3}-[0-9]{3}-[0-9]{4}");
        Pattern p2 = Pattern.compile("\\([0-9]{3}\\)\\s[0-9]{3}-[0-9]{4}");

        Matcher m1 = p1.matcher(text);
        Matcher m2 = p2.matcher(text);

        String ans;

        if (text.length() == 12) {
            if (m1.matches()) {
                ans = m1.group();
            } else {
                ans = "NONE";
            }
        } else if (text.length() == 13) {
            if (m2.matches()) {
                ans = m2.group();
            } else {
                ans = "NONE";
            }
        } else {
            if (m1.find() && m2.find()) {
                if (m1.start() < m2.start()) {
                    ans = m1.group(0);
                } else {
                    ans = m2.group();
                }
            } else {
                m1.reset();
                m2.reset();
                if (m1.find()) {
                    ans = m1.group(0);
                } else if (m2.find()) {
                    ans = m2.group(0);
                } else {
                    ans = "NONE";
                }
            }
        }
        return ans;
    }

    public static void main(String args[]) throws Exception {
    }


}
//aabbccddgfsdaabababacdcdcd
//aabbccddgfsdaabababacdcdcd
//1a2b2c2d2gfsda2bababacdcdcd