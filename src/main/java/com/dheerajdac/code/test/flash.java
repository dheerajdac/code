package com.dheerajdac.code.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class flash {


    public static double max(double a , long b ,long c){
        return (a>b*1.0) ?a:b;
    }

    public static long max4(long a, long b, long c, long d){
        long temp = a;

        if(temp < b){
            temp = b;
        }

        if(temp < c){
            temp = c;
        }

        if(temp < d){
            temp = d;
        }


        return temp;
    }

    public static void main(String args[]) throws Exception {
        FMods scanner = new FMods();
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));


        long n = scanner.nextLong();
        /*long p = scanner.nextLong();
        long q = scanner.nextLong();
        long r = scanner.nextLong();
        long s = scanner.nextLong();*/

        for (int i = 0; i < n; i++) {
            long s_p = scanner.nextLong();
            long s_q = scanner.nextLong();
            long s_r = scanner.nextLong();
            long s_s = scanner.nextLong();

            long d_p = scanner.nextLong();
            long d_q = scanner.nextLong();
            long d_r = scanner.nextLong();
            long d_s = scanner.nextLong();


            long f_p = scanner.nextLong();
            long f_q = scanner.nextLong();
            long f_r = scanner.nextLong();
            long f_s = scanner.nextLong();


            long c_p = scanner.nextLong();
            long c_q = scanner.nextLong();
            long c_r = scanner.nextLong();
            long c_s = scanner.nextLong();

            double flash_sum = max(s_p*1.0 / 2, (s_p - f_p * d_p), f_p * d_p) + max(s_q *1.0/ 2, s_q - f_q * d_q, f_q * d_q) + max(s_r *1.0/ 2, s_r - f_r * d_r, f_r * d_r) + max(s_s *1.0/ 2, s_s - f_s * d_s, f_s * d_s);
            double cisco_sum = max(s_p*1.0 / 2, (s_p - c_p * d_p), c_p * d_p) + max(s_q *1.0/ 2, s_q - c_q * d_q, c_q * d_q) + max(s_r *1.0/ 2, s_r - c_r * d_r, c_r * d_r) + max(s_s *1.0/ 2, s_s - c_s * d_s, c_s * d_s);

          //  long flash_sum = max(s_p/2 , (s_p - f_p * d_p)) + max(s_q/2, s_q - f_q * d_q) + max(s_r/2, s_r-f_r * d_r) + max(s_s/2 , s_s-f_s * d_s);
           // long cisco_sum = max(s_p/2 , (s_p - c_p * d_p)) + max(s_q/2, s_q - c_q * d_q) + max(s_r/2, s_r-c_r * d_r) + max(s_s/2 , s_s-c_s * d_s);
            if (flash_sum > cisco_sum) {
                out.write("Flash\n");
            } else if (flash_sum < cisco_sum) {
                out.write("Cisco\n");
            } else {
                long flash_time = max4(f_p,f_q,f_r,f_s);
                long cisco_time = max4(c_p,c_q,c_r,c_s);
                if (flash_time < cisco_time) {
                    out.write("Flash\n");
                } else if (flash_time > cisco_time) {
                    out.write("Cisco\n");
                } else {
                    out.write("Tie\n");
                }
            }
        }
        out.close();
    }


}

class FMods {
    BufferedReader br;
    StringTokenizer st;

    public FMods() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String nextToken() throws Exception {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());

        }
        return st.nextToken();
    }

    int nextInt() throws Exception, Exception {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}
