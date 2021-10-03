
package com.dheerajdac.code.leet.easy;

import java.util.*;

public class WordPattern {

	public boolean workPattern(String pattern, String s){
		
		String[] arr = new String[26];

		String[] stringArr = s.split(" ");
		if(pattern.length() != stringArr.length){
			return false;
		}
		Set<String> set = new HashSet<>();

		for(int i = 0; i < stringArr.length; i++) {
			
			String temp = arr[pattern.charAt(i) - 'a'];

			if(temp != null){
				if(!temp.equals(stringArr[i])){
					return false;
				}
			} else {
				if(set.contains(stringArr[i])){
					return false;
				}
				set.add(stringArr[i]);
				arr[pattern.charAt(i) - 'a'] = stringArr[i];
			}

		}

		return true;

	}
}