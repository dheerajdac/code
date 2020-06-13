package com.dheerajdac.code.test;

public class decompress {


    public static void main(String args[]) throws Exception {
        String s = "1abc";//"2aabbccddgfsdaaba3cd3";
        // Write your code here.
        //String s = deduplicatedStr;//"2aabbccddgfsdaaba3cd3";
        int length = s.length();


        int k;
        for (k = 0; k < length; k++) {
            if (Character.digit(s.charAt(k), 10) < 0) {
                break;
            }
        }
        String w = s.substring(0, k);
        int window;
        if (w.length() != 0) {
            window = Integer.valueOf(w);

            StringBuilder out = new StringBuilder();

            int i = k;
            while (i < length) {
                if(i+window < length)
                    out.append(s.substring(i, i + window));
                else
                    out.append(s.substring(i, length));
                int temp = 0;
                int j = window;
                for (j = i + window; j < length; j++) {
                    if (Character.digit(s.charAt(j), 10) < 0)
                        break;
                }
                String d;
                if(i+window < length)
                    d = s.substring(i + window, j);
                else
                    d = s.substring(i + window, j);

                if (d.length() != 0) {
                    temp = Integer.valueOf(d);
                }
                for (j = 1; j < temp; j++) {
                    out.append(s.substring(i, i + window));
                }
                i = i + window + d.length();
            }

           // return out.toString();
        } else {
          //  return s;
        }
    }

}
//aabbccddgfsdaabababacdcdcd
//aabbccddgfsdaabababacdcdcd
//1a2b2c2d2gfsda2bababacdcdcd