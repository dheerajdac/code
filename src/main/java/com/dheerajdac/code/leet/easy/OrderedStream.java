package com.dheerajdac.code.leet.easy;

import java.util.*;

public class OrderedStream {

    int ptr = 0;

    String[] arr;

    public OrderedStream(int n) {
        arr = new String[n];
    }

    public List<String> insert(int id, String value) {
        arr[id-1] = value;
        
        List<String> result = new ArrayList<String>();

        while(ptr < arr.length && arr[ptr] != null && !arr[ptr].isEmpty()) {
            result.add(arr[ptr]);    
            ptr++;
        }

        return result;
    }
}
