package com.dheerajdac.code.test;

import java.math.BigInteger;
import java.util.*;

public class Array3 {


    public static String solution(int N, int[] A, int X) {

        List<Integer> unqiueNumberList = step1(A);
        if(unqiueNumberList.isEmpty()){
            return "-1";
        }


        List<List<Integer>> listOfIndexOfSubArray = step2(unqiueNumberList);
        if(listOfIndexOfSubArray.isEmpty()){
            return "-2";
        }

        BigInteger max = BigInteger.ZERO;
        max = step3(unqiueNumberList, listOfIndexOfSubArray, max);
        return max.toString();

    }

    private static BigInteger step3(List<Integer> list, List<List<Integer>> lists, BigInteger max) {
        for(List<Integer> list1 : lists) {
            List<String> arr = new ArrayList<>();
            StringBuilder value = new StringBuilder();
            for (Integer i : list.subList(list1.get(0), list1.get(1) + 1)) {
                Integer f = i;
                if(i < 0){
                    f = -1*i;
                }
                arr.add(f.toString());
            }

            Collections.sort(arr, new Comparator<String>() {
                        @Override
                        public int compare(String X, String Y) {
                            String XY = X + Y;
                            String YX = Y + X;
                            return XY.compareTo(YX) > 0 ? -1 : 1;
                        }
            });

            for (Object anArr : arr) value.append(anArr);

            BigInteger v = new BigInteger(value.toString());

            if(max.compareTo(v) == -1){
                max = v;
            }
        }
        return max;
    }

    private static List<List<Integer>> step2(List<Integer> list) {
        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < list.size()-3; i++) {
            List<Integer> list1 = new ArrayList<>();
            if(list.get(i) >= list.get(i + 3)) {
                list1.add(i);
                list1.add(i+3);
                lists.add(list1);
            }
        }
        return lists;
    }

    private static List<Integer> step1(int[] A) {
        Map<Integer, Boolean> map = new HashMap<>();

        for(int a : A){
            if(map.get(a) != null){
                map.put(a, false);
            } else {
                map.put(a, true);
            }
        }

        Set<Map.Entry<Integer, Boolean>> entries = map.entrySet();
        List<Integer> list = new ArrayList<>();
        for(Integer a : A){
            if(map.get(a) == true){
                list.add(a);
            }
        }
        return list;
    }

    public static void main(String args[]) throws Exception {
        /*Scanner sc  = new Scanner(System.in);
        String[] list = sc.nextLine().split(",");

        Map<String,List<String>> adjlist = new HashMap<>();

        for(String name: list){
            adjlist.put(name, new ArrayList<>());
        }

        for (int i = 0; i < list.length; i++) {

        }*/


        int N = 20;
        int[] array = {-20, 20, -10, 20, 0, 4, 8, -20, 10, -10, 8, 6, 15, 9, 18, 35, 40, -30, -90, 99};
        int X = 4;

        System.out.println(solution(N,array,X));



    }
}


