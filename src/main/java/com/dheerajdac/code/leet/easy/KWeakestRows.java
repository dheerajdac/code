package com.dheerajdac.code.leet.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KWeakestRows{

    class TestObj  implements Comparable<TestObj> {

        int count;

        int index;

        public TestObj(int count, int index){
            this.count = count;
            this.index = index;
        }

        @Override
        public int compareTo(TestObj obj) {
            return this.count - obj.count;
        }

    }

    public int[] kWeakestRows(int[][] mat, int k){
        

        List<TestObj> list = new ArrayList<>();

        for(int i=0; i< mat.length; i++){
            int count = 0;
            for(int j = 0; j < mat[i].length; j++){
                count = count + mat[i][j];
            }
            list.add(new TestObj(count, i));
        }

        Collections.sort(list);

        int[] result = new int[k];

        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).index;
        }

        return result;
    }

    public static void main(String[] args){

    }

    
    
}
