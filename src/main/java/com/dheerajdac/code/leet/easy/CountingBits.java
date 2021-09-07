package com.dheerajdac.code.leet.easy;

public class CountingBits {

	public int[] countBits(int n){
		int[] result = new int[n+1];

		for(int i= 0; i < n+1;i++){
			result[i] = result[i >> 1] + (i & 1);
		}

		return result;
	}
	
}
