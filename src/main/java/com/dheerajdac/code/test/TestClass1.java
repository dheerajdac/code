package com.dheerajdac.code.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class TestClass1 {

    public static void main(String[] args) throws Exception {
        M scanner = new M();
        int n = scanner.nextInt();
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Long> maxH = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Long> minH = new PriorityQueue<>();
        int number = 0;
        while(n-->0) {
            int q = scanner.nextInt();
            if(q==1) {
                long value = scanner.nextLong();
                number++;
                if(number >= 3) {
                    if (number%3 == 0) {
                        if (maxH.peek() > value) {
                            minH.add(maxH.poll());
                            maxH.add(value);
                        } else {
                            minH.add(value);
                        }
                    } else {
                        if (minH.peek() != null && minH.peek() < value) {
                            maxH.add(minH.poll());
                            minH.add(value);
                        } else {
                            maxH.add(value);
                        }
                    }
                } else{
                    maxH.add(value);
                }
            }
            else {
                if(number >= 3) {
                    out.write(minH.peek()+ "\n");
                }
                else{
                    out.write("Not enough enemies\n");
                }
            }
        }
        out.close();
    }

}


class Ma {
    BufferedReader br;
    StringTokenizer st;

    public Ma() {
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