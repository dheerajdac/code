package com.dheerajdac.code.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;


public class compareString1 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int q = Integer.parseInt(input[1]);
        String a = reader.readLine();
        reader.readLine();
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if(a.charAt(i)=='1'){
                hashSet.add(i+1);
            }
        }

        int ones = 0;
        int length = hashSet.size();
        for(int j = 0; j < q;j++) {
            int ind = Integer.parseInt(reader.readLine());
            if(hashSet.contains(ind)) {
                ones++;
            }
            if(ones >= length) {
                out.write("YES\n");
            }
            else {
                out.write("NO\n");
            }
        }
    }

}
