package com.dheerajdac.code.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class TestClass {

    public static void main(String[] args) throws Exception {
        M ms = new M();
        int n = ms.nextInt();
        PriorityQueue<Long> maxh = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Long> minh = new PriorityQueue<>();
        int num = 0;
        while(n-->0) {
            int q = ms.nextInt();
            if(q==1) {
                long p = ms.nextLong();
                num++;
                if(num < 3) {
                    minh.add(p);
                }
                else {
                    if (p > minh.peek()) {
                        if (minh.size() < num / 3) {
                            minh.add(p);
                        } else {
                            maxh.add(minh.poll());
                            minh.add(p);
                        }
                    } else {
                        if (minh.size() >= num/3) {
                            maxh.add(p);
                        } else {
                            minh.add(maxh.poll());
                            maxh.add(p);
                        }
                    }
                }
            }
            else {
                if(maxh.size() < 3) {
                    System.out.println("Not enough enemies");
                }
                else{
                    System.out.println(minh.peek());
                }
            }
        }
    }

}


class M {
    BufferedReader br;
    StringTokenizer st;

    public M() {
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
