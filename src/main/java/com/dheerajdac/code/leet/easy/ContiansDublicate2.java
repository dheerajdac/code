package com.dheerajdac.code.leet.easy;

import java.util.*;

public class ContiansDublicate2 {

	public boolean containsNearbyDuplicate(int[] nums, int k){
		/** 
		for(int i =0; i < nums.length; i++){

			for(int j = i +1 ; j < nums.length && j < i + k +1; j++){
				if(nums[i] == nums[j]){
					return true;
				}
			}

		}
		*/

		Set<Integer> set = new HashSet<>();
		for(int i =0; i < nums.length; i++){
			if(i > k) {
				set.remove(nums[i-k-1]);
			}
			if(!set.add(nums[i])) {
				return true;
			}
		}
		return false;
	}
}