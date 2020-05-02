package com.dheerajdac.code.test;

import java.util.*;

public class practice {


    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        int n = sc.nextInt();

        int[] ans = new int[line.length()+1];
        ans[0] = 0;
        ans[1] = 1;
        for (int i = 2; i < line.length()+1; i++) {
            ans[2] = 0;
        }

        //for (int i = 0; i < n; i++) {
            for (int j = 2; j < line.length()+1; j++) {
                Map<Character, Integer> map = new HashMap<>(100);
                for (int k = 0; k < j; k++) {
                    if (map.get(line.charAt(k)) == null) {
                        map.put(line.charAt(k), 1);
                    } else {
                        int temp = map.get(line.charAt(k));
                        temp++;
                        map.put(line.charAt(k), temp);
                    }
                }

                for (int k = 0; k < line.length() - j + 1; k++) {
                    if(k !=0) {
                        if (map.get(line.charAt(k - 1)) != null) {
                            int temp = map.get(line.charAt(k - 1));
                            temp--;
                            map.put(line.charAt(k - 1), temp);
                        }
                        int temp1 = k + j - 1;
                        if (map.get(line.charAt(temp1)) == null) {
                            map.put(line.charAt(temp1), 1);
                        } else {
                            int temp = map.get(line.charAt(temp1));
                            temp++;
                            map.put(line.charAt(temp1), temp);
                        }
                    }
                    if (iispal(map)) {
                        ans[j] = j;
                    }
                }
            }
    //    }
        for (int i = 0; i < n; i++) {
            int length = sc.nextInt();
            int u = length;
            if(ans[length] ==0) {

                while(ans[u] == 0){
                    u++;
                }
            }
            System.out.println(ans[u]);
        }
    }

    private static boolean iispal(Map<Character, Integer> map) {

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();

        Iterator iterator = entries.iterator();
        boolean toggle = true;
        boolean t = false;
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            if ((int) pair.getValue() % 2 != 0 && toggle) {
               toggle = !toggle;
            }else{
                 if(!toggle)
                     return false;
            }
        }
        return true;
    }
}
