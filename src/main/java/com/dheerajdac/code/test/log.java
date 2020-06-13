package com.dheerajdac.code.test;

import java.util.Scanner;

public class log {


    static long power(long x, long y)
    {
        long res = 1;

        while (y > 0)
        {
            if (y % 2 == 1)
                res = res*x;
            y = y>>1;
            x = x*x;
        }
        return res;
    }

    public static void main(String args[]) throws Exception {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t-- > 0 )
        {
            Long n;
            n = sc.nextLong();
            int i=0;
            for( i=0;;i++)
            {
                Long temp= (3*( power(3,i) -1 ) )/2;
                if(temp>n)
                    break;
            }
            System.out.println(i);
        }
        sc.close();
    }
}
