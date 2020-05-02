package com.dheerajdac.code.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class practice1 {


    public static void main(String args[]) throws Exception {
        //Scanner sc = new Scanner(System.in);
        ModScanners mc =  new ModScanners();
        int length = mc.nextInt();
        int q = mc.nextInt();
        String s1 = mc.nextToken();

        int pointer = length-1;
        boolean flag = true;
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) == '0') {
                pointer = i;
                break;
            }
        }

        for (int i = 0; i < q; i++) {
            int index = mc.nextInt();
            if(index == pointer){
                if(s1.charAt(index) == '0'){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}

class ModScanners{
    BufferedReader br;
    StringTokenizer st;

    public ModScanners() {
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
//aabbccddgfsdaabababacdcdcd
//aabbccddgfsdaabababacdcdcd
//1a2b2c2d2gfsda2bababacdcdcd