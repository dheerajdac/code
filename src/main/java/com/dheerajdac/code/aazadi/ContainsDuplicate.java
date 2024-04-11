package com.dheerajdac.code.aazadi;

import java.util.*;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (Integer integer : nums) {
            if(set.contains(integer)){
                return false;
            } else {
                set.add(integer);
            }
        }
        return true;
    }
    
}
