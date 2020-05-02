package com.dheerajdac.code.test;/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Array4 {


    public static void main(String args[]) throws Exception {
        ModScanner3 mc =  new ModScanner3();
        int times = mc.nextInt();
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));


        for(int g = 0 ; g < times; g++){
            int length = mc.nextInt();
            int[] a = new int[length];
            int count = 0;
            for (int i = 0; i < length; i++) {
                a[i] = mc.nextInt();
                if(a[i] == 1)
                    count++;
            }
            if(count %3 == 0 ) {
                int index = getValue(a);
                if (index == -1) {
                    out.write(-1+"\n");
                } else {
                    out.write(mod(a, index) + "\n");
                }
            }
            else{
                out.write(-1+"\n");
            }
        }
        out.flush();
        out.close();
    }

    public static long modFast(long x, long y){
        long res = 1;
        long p = 1000000007L;
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

    public static long mod(int[] a, int end){
        //System.out.println(end);
        long modsum = 0;
        long mod = 1000000007L;


        for (int i = 0; i < end+1; i++) {
            modsum = a[end - i] == 0 ? modsum : ((long) (modsum + ((modFast(2, i))))) % mod;
        }
        return modsum;

    }

    public static int getValue(int[] a) {
        int length = a.length;
        int p1 = 0;
        int p2 = length - 1;
        int result = -1;

        for (int i = 0; i < length; i++) {
            int value = compareString(a, 0, p1 + 1, p2, length);
            if(p1 == p2)
                return -1;
            if (value == -1) {
                p1 = ++p1;
            } else if (value == 1) {
                p2 = --p2;
            } else {
                result = compareString(a, 0, p1 + 1, p1 + 1, p2);
                if (result == 0)
                    return p1;
                else if (result == 1)
                    return -1;
                p2 = --p2;
            }
        }

        return result;

    }


    public static int compareString(int[] a, int start1, int end1, int start2, int end2) {

        int trim1 = trim(a, start1, end1);
        int trim2 = trim(a, start2, end2);
        int length1 = end1 - trim1;
        int length2 = end2 - trim2;

        if (length1 == length2) {
            int i;
            for (i = 0; i < length1; i++) {
                if (a[trim1 + i] != a[trim2 + i]) {
                    return a[trim1 + i] == 1 ? 1 : -1;
                }
            }
        } else if (length1 > length2) {
            return 1;
        } else {
            return -1;
        }
        return 0;
    }

    private static int trim(int[] a, int start, int end) {
        int i;
        for (i = start; i < end; i++) {
            if (a[i] == 1)
                break;
        }
        return i;
    }


}
*/
