
package com.dheerajdac.code.leet.easy;

import java.util.*;

public class BinaryWatch {

	int[] bits = {1,2,4,8,16,32};

	public List<String> readBinaryWatch(int turnedOn){
		List<String> res = new ArrayList<>();

		for(int i =0; i <= turnedOn; i++){
			List<Integer> list1 = getCombinations(4, i);
			List<Integer> list2 = getCombinations(6, turnedOn - i);
			for(int num1: list1) {
				if(num1 >= 12) continue;
				for(int num2: list2) {
					if(num2 >= 60) continue;
					res.add(num1 + ":" + (num2 < 10 ? "0" + num2 : num2));
				}
			}
		}
		return res;
	}

	public List<Integer> getCombinations(int count, int turnedOn) {
		List<Integer> result = new ArrayList<>();
		getAllCombinations(count, turnedOn,0, 0, result);
		return result;
	}


	public void getAllCombinations(int count, int turnedOn,int pos, int sum, List<Integer> result) {
		if(turnedOn ==0){
			result.add(sum);
			return;
		}

		for(int i=pos; i < count - turnedOn +1; i++){
			getAllCombinations(count, turnedOn-1, i, sum+bits[i],result);
		}
	}

}