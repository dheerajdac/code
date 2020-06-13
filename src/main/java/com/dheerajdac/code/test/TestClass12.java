package com.dheerajdac.code.test;/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass12 {
    public static void main(String args[]) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        Long no = Long.valueOf(s.nextLine());                 // Reading input from STDIN


        //String c[] = cost.split(" ");
        while (no > 0) {
            Long cost = Long.valueOf(s.nextLine());
            String ts = s.nextLine();


            String t[] = ts.split(" ");
            Map<Long, Long> map = new HashMap<>();

            for (int i = 0; i < cost; i++) {
                Long temp = map.get(Long.valueOf(t[i]));
                if (temp == null) {
                    map.put(Long.valueOf(t[i]), 1L);
                } else {
                    map.put(Long.valueOf(t[i]), ++temp);
                }
            }

            Long ans = 0L;

            for (Long i = -1000L; i <= 1000; i++) {
                for (Long j = i; j <= 1000; j++) {
                    if ((i + j) % 2 == 0 && map.get(i) != null && map.get(j) != null && map.get((i+j)/2)!=null) {
                        if (i == j) {
                            ans = ans + (map.get(i) * (map.get(i) - 1)) / 2;
                        } else {    
                            ans = ans + (map.get(i) * (map.get(j)));
                        }
                    }
                }
            }
            no--;
            System.out.println(ans);
        }
        s.close();

    }


}
