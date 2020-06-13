package com.dheerajdac.code.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class hashout {


    public static void main(String args[]) throws Exception {
        //Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = s.nextInt();
        s.nextLine();

        for (int i = 0; i < n  ; i++) {
            String string1 = s.nextLine();
            String string2 = s.nextLine();

            Map<String, Integer> map1 = new HashMap<>();
            Map<String, Integer> map2 = new HashMap<>();


            int temp1 = 0;
            int temp2 = 0;
            boolean flag = true;

            for (int j = 0; j < string1.length(); j++) {
                String a = String.valueOf(string1.charAt(j));
                if(map1.get( a) == null)
                    map1.put( a , 1);
                else {
                    map1.put(a, map1.get(a)+1);
                }
            }



            for (int j = 0; j < string2.length(); j++) {
                    String s1 = String.valueOf(string2.charAt(j));
                    Integer temp = map1.get(s1);
                    if(temp != null){
                        temp++;

                        if(temp == 1){
                            map1.remove(s1);
                        } else {
                            map1.put(s1, map1.get(s1)-1);
                        }
                    }
                }





            /*if(size1 - temp1 == size2 -temp1){
                out.write("Drawn\n");
            }else if( size1 - temp1 > size2 - temp1){
                out.write("Knight Wins\n");
            }else {
                out.write("Jack Wins\n");
            }*/

            if(string1.length() - temp1 == string2.length() -temp1){
                out.write("Drawn\n");
            }else if( string1.length() - temp1 > string2.length() - temp1){
                out.write("Knight Wins\n");
            }else {
                out.write("Jack Wins\n");
            }

        }
        out.flush();
        out.close();
        s.close();
    }
}


class ModScanner1 {
    BufferedReader br;
    StringTokenizer st;

    public ModScanner1() {
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


/*
4
tojwroyr qfihlzmp tkeuhssk szqdhmvc cgbvwznn fxusygkr
tojwroyr qfihlzmp tkeuhssk szqdhmvc cgbvwznn fxusygkr sqozigjd hbgondtq
yvfpp vfofo zivao mprfh dbvlu
yvfpp vfofo zivao mprfh dbvlu mprfh dbvlu
njjow skorn wrbzr eriap hbpdn eriap hbpdn
njjow skorn wrbzr eriap hbpdn
jqxqz orutj euuqw wisia fetjc
zywot cxjzp knigg rmcnf zlntu
*/

