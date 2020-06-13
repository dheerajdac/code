package com.dheerajdac.code.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class compareString {


    public static void main(String args[]) throws Exception {
        //Scanner sc = new Scanner(System.in);
        Mods mc =  new Mods();
        int length = mc.nextInt();
        int q = mc.nextInt();
        String s1 = mc.nextToken();
        //String s2 = sc.nextLine();
        StringBuilder s3 = new StringBuilder(mc.nextToken());

        int pointer = length-1;
        boolean flag = true;
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) != s3.charAt(i)) {
                pointer = i;
                if (s1.charAt(i) == '0' && s3.charAt(i) == '1') {
                    flag = false;
                }
                break;
            }
        }


        if (flag) {
            for (int i = 0; i < q; i++) {
                int index = mc.nextInt()-1;
                if (flag) {
                    int temp = pointer;
                    if (s3.charAt(index) == '0' && index >= temp) {
                        s3.setCharAt(index, '1');
                        if (index < temp) {
                            if (s1.charAt(index) == '0') {
                                flag = false;
                            }
                        }
                        if (index == temp) {
                            for (int k = pointer; k < length; k++) {
                                if (s1.charAt(k) != s3.charAt(k)) {
                                    pointer = k;
                                    if (s1.charAt(k) == '0' && s3.charAt(k) == '1') {
                                        flag = false;
                                    }
                                    break;
                                }
                            }
                        }
                    } else {
                        if (s1.charAt(index) == '0' && s3.charAt(index) == '1') {
                            flag = false;
                        }
                    }
                    if (s3.charAt(pointer) == '0' && flag) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                } else {
                    System.out.println("YES");
                }
            }
        } else {
            for (int i = 0; i < q; i++) {
                System.out.println("YES");
            }
        }
    }
}

class ModScanner {
    BufferedReader br;
    StringTokenizer st;

    public ModScanner() {
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