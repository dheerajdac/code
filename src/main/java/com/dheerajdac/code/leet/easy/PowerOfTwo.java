
package com.dheerajdac.code.leet.easy;


public class PowerOfTwo {

	public boolean isPowerOfTwo(int n){
		if(n <= 0){
			return false;
		}

		return n == (n&(-n));
	}
}