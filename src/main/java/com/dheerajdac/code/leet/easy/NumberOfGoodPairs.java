package com.dheerajdac.code.leet.easy;
import java.util.*;

public class NumberOfGoodPairs {


    public int numIdenticalPairs(int[] nums){

        int result = 0;
        for(int i=0; i < nums.length; i++){
            for(int j = i+1; j<nums.length;j++) {

                if(nums[i] == nums[j]){
                    result++;
                }
            }
        }

        return result;
    }

// hash and count 

    public int hashAndCount(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap();

        for(int i =0; i<nums.length; i++){
            if(map.get(nums[i]) != null){
                Integer count = map.get(nums[i]);
                count++;
                map.put(nums[i], count);
            } else {
                map.put(nums[i], 1);
            }
        }

        for(Integer num : map.keySet()){
            int pair = (map.get(num)*(map.get(num)-1))/2;
            result += pair;
        }
        return result;
    }


// does not work for pairs
    public int hashMethod(int[] nums){
        
        Set<Integer> map = new HashSet<>();
        
        int result = 0;

        for(int i=0; i<nums.length;i++){
            if(map.contains(nums[i])){
                result++;
            } else {
                map.add(nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
