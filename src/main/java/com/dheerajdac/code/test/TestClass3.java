package com.dheerajdac.code.test;/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes

import java.util.Scanner;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass3 {
    static long power(long x, long y, long p)
    {
        // Initialize result
        long res = 1;

        // Update x if it is more
        // than or equal to p
        x = x % p;

        while (y > 0)
        {
            // If y is odd, multiply x
            // with result
            if((y & 1)==1)
                res = (res * x) % p;

            // y must be even now
            // y = y / 2
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

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

        final long v = 1000000007L;
        //String c[] = cost.split(" ");
        while (no > 0) {
            //Long cost = Long.valueOf(s.nextLine());
            String ts = s.nextLine();


            String t[] = ts.split(" ");

            int temp= 0;
            for (int i = 1; i <= 9; i++) {
                for (int j = 0; j <= 9; j++) {
                    if(j-i == Integer.valueOf(t[1])){
                        temp++;
                        //aSystem.out.println(i + "\t" +j);
                    }
                }
            }


            Long ans = power(10L,Long.valueOf(t[0])-2L,v);




            System.out.println((long)((ans*temp)%v));
            no--;
        }
        s.close();

    }


}
