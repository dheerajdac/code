package com.dheerajdac.code.test;

import java.util.ArrayList;
import java.util.List;

class Super
{
    public int i = 0;

    public Super(String text) /* Line 4 */
    {
        i = 1;
    }
}

class Sub extends Super
{
    public Sub(String text)
    {
        super(text);
        i = 2;
    }

    private static StringBuilder app(StringBuilder sb, int start, int previous) {
        sb.append(start);
        if(start!=previous) sb.append(previous-start>1? "-": ",").append(previous);
        return sb;
    }



    static String solution(int[] array) {
        List<Integer> l1 = new ArrayList();
        for(int i=0; i< array.length; i++ ){
            l1.add(array[i]);
        }

        StringBuilder builder = new StringBuilder();
        int p = l1.get(0), o = p;
        for(int next: l1.subList(1, l1.size())) {
            if(p+1 != next) {
                app(builder, o, p).append(",");
                o = next;
            }
            p = next;
        }
        String ans = app(builder, o, p).toString();
        return ans;
    }

    public static void main(String args[])
    {
        int[] a = new int[]{1,2};


        Sub sub = new Sub("Hello");
        System.out.println(sub.i);
    }
}