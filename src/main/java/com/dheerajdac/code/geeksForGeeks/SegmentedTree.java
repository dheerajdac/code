package com.dheerajdac.code.geeksForGeeks;

public class SegmentedTree {

	int[] st;

	public int constructTree(int[] arr, int n, int ss, int se, int si){
		if(ss == se){
			st[si] = arr[se];
			return arr[ss];
		}

		int mid = ss + ((se-ss)/2);

		st[si] = Math.min(constructTree(arr, n, ss, mid, 2*si+1),
			constructTree(arr, n, mid+1, se, 2*si+2));

		return st[si];

	}

	public void build(int[] arr){
		int n= arr.length;

		double height = Math.ceil(Math.log(n)/Math.log(2));

		int size = 2 * (int)Math.pow(2, height) - 1;

		st = new int[size];

		constructTree(arr, n, 0, n-1, 0);
	}

	public int query(int ss, int se, int qs,int qe, int si){
		if(qs <= ss && qe >= se){
			return st[si];
		}

		if(ss > qe || se < qs){
			return Integer.MAX_VALUE;
		}

		int mid = ss + ((se - ss)/2);

		return Math.min(query(ss, mid, qs, qe, 2 *si +1),
				query(mid+1, se, qs, qe, 2*si+2));

	}

	private int q(int[] arr, int qs, int qe){
		return query(0, arr.length - 1, qs, qe, 0);
	}

	public static void main(String[] args) {
		int[] arr = {1, 3, 2, 7, 9, 11};

		SegmentedTree tree = new SegmentedTree();
		tree.build(arr);
		System.out.println(tree.q(arr, 1, 5));
		
	}
	
}
