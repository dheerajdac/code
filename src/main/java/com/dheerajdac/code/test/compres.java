package com.dheerajdac.code.test;

import java.util.*;

public class compres {


    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        //int n = sc.nextInt();
        int length = line.length();

        int window = 10;

        /*List<StringBuilder> out = new ArrayList<>();
        out.add(null);*/
        StringBuilder ans = new StringBuilder(line);

        StringBuilder out ;
        for (int i = 1; i <= window; i++) {
            if(length%i ==0 ) {
                String last = line.substring(0, i);
                int time = 0;
                out = new StringBuilder();
                out.append(i);
                for (int j = 0; j < length - i + 1; j += i) {
                    if (last.equals(line.substring(j, j + i))) {
                        time++;
                    } else {
                        out.append(last);
                        if (time > 1) {
                            out.append(time);
                        }
                        last = line.substring(j, j + i);
                        time = 1;
                    }
                }
                out.append(last);
                if (time > 1) {
                    out.append(time);
                }
                if (ans.length() > out.length()) {
                    ans = out;
                }
            }
        }
        System.out.println(ans.toString());
        sc.close();
    }

}
