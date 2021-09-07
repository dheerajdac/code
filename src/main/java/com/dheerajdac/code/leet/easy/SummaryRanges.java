package com.dheerajdac.code.leet.easy;

import java.util.*;

public class SummaryRanges {

	public List<String> summaryRanges(int[] nums) {
		List<String> result = new ArrayList<>();

		if(nums.length == 0){
			return result;
		}

		int lastValue = nums[0];
		int size = 0;
		String temp = "" + lastValue;

		if(nums.length ==1) {
			result.add(""+nums[0]);
			return result;
		}
		for(int i = 1; i < nums.length; i++){
			
			if(lastValue +1 == nums[i]){
				lastValue = nums[i];
				size++;
			} else {
				if(size > 0){
					result.add(temp + "->" +nums[i-1]);
				} else {
					result.add(temp);
				}
				lastValue = nums[i];
				temp = "" + lastValue;	
				size = 0;
			}

			if(i == nums.length  - 1){
				if(size > 0){
					result.add(temp + "->" +nums[i]);
				} else {
					result.add(temp);
				}	
			}
		}

		return result;
	}
}