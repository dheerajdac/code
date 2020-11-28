package com.dheerajdac.code.leet.easy;

import java.util.*;

public class RunningSumOf1DArray {

	public int[] runningSum(int[] nums){
		int[] result = new int[nums.length];
		
		int last = 0;
		for(int i=0; i<nums.length; i++) {
			result[i] = last + nums[i];	
			last = result[i];
		}

		return result;
	}

	public static void main(String[] args){
		System.out.println("hello world");
	}
}
