package com.dheerajdac.code.geeksForGeeks;

import java.util.Arrays;

public class KMP {

    public void searchPattern(String str, String pre){

        int M = str.length();
        int N = pre.length();
        int[] lps = createLongestPrefixArray(pre);

        int i=0;
        int j=0;
        while (i<M) {
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j++;
            }
            if(j == N){
                System.out.println(i-j);
                j=lps[j-1];
            } else if(i < M && str.charAt(i) != pre.charAt(j)){
                if(j ==0){
                    i++;
                } else {
                    j = lps[j-1];
                }
            }
        }

    }

    public int[] createLongestPrefixArray(String str){
        int M = str.length();
        int[] nums = new int[M];

        nums[1] = 0;
        int i = 1;
        int length = 0;
        while (i < M) {

            if(str.charAt(i) == str.charAt(length)){
                length++;
                nums[i] = length;
                i++;
            } else {
                if(length !=0) {
                    length= nums[length-1];
                } else {
                    nums[i] = 0;
                    i++;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        KMP kmp = new KMP();
        kmp.searchPattern("ACACAFACACBACACAFACACB","ACACAFACACB");
    }

}
