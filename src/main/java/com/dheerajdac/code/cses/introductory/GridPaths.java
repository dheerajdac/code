package com.dheerajdac.code.cses.introductory;

import java.util.*;
import java.io.*;

public class GridPaths {

	ModReader reader = new ModReader();
	ModWriter writer = new ModWriter();

	private class ModReader {
		BufferedReader br;
		StringTokenizer st;

		public ModReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String nextToken() throws Exception {
			while (st == null || !st.hasMoreElements()) {
			st = new StringTokenizer(br.readLine());

			}
			return st.nextToken();
		}

		int nextInt() throws Exception, Exception {
			return Integer.parseInt(nextToken());
		}

		long nextLong() throws Exception {
			return Long.parseLong(nextToken());
		}

		double nextDouble() throws Exception {
			return Double.parseDouble(nextToken());
		}

		String[] nextStringArray() throws Exception {
			return nextToken().split(" ");
		}

		int[] nextIntArray(int n) throws Exception {
			int[] result = new int[n];

			for(int i = 0 ; i < n; i++){
				result[i] = Integer.valueOf(nextToken());
			}
			return result;
		}
	}

	private class ModWriter {

		BufferedWriter out;

		public ModWriter() {
        		out = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object obj) throws Exception{
			out.write(obj.toString() + "");
		}

		public void println(Object obj) throws Exception {
			out.write(obj.toString() + "\n");
		}

		public void flush() throws Exception {
			out.flush();
		}

		public void close() throws Exception {
			out.close();
		}

	}

	private void print(Object obj){
		try {
			writer.print(obj);
		} catch(Exception ex){

		}
	}

	private void println(Object obj){
		try {
			writer.println(obj);
		} catch (Exception e) {
			//TODO: handle exception
		}
	}

	int sum = 0;

	public void recur(int[][] arr, int row, int col, String str, int i){
		if(i == 48 && row == 6 && col == 0){
			sum++;
			return;
		}

		if(row == 6 && col == 0){
			return;
		}

		if(i == 48){
			return;
		}

		if(arr[row][0] == 1 && arr[row][6] == 1){
			int temp = 0;
			for(int j = 0; j < 7; j++){
				if(arr[row][j] == 1){
					temp++;
				}
			}
			if(temp == 7){
				for(int j = 0; j < 7 ;j++){
					for(int l =0; l < row;l++){
						if(arr[l][j] == 0){
							return;
						}
					}
				}
			}
		}

		if(arr[0][col] == 1 && arr[6][col] == 1){
			int temp = 0;
			for(int j = 0; j < 7; j++){
				if(arr[j][col] == 1){
					temp++;
				}
			}
			if(temp == 7){
				for(int j = 0; j < 7 ;j++){
					for(int l =col; l < 7;l++){
						if(arr[j][l] == 0){
							return;
						}
					}
				}
			}
		}

		if(row == 6 ){
			if(str.charAt(i) == '?'){
				if(row - 1 >= 0 && arr[row-1][col] == 0){
					arr[row-1][col] = 1;
					recur(arr, row -1 , col, str, i + 1);
					arr[row-1][col] = 0;
				}
				if(col - 1 >= 0 && arr[row][col-1] == 0){
					arr[row][col-1] = 1;
					recur(arr, row , col-1, str, i + 1);
					arr[row][col-1] = 0;
				}

			} else if(str.charAt(i) == 'U'){
				if(row - 1 >= 0 && arr[row-1][col] == 0){
					arr[row-1][col] = 1;
					recur(arr, row -1 , col, str, i + 1);
					arr[row-1][col] = 0;
				}
			} else if(str.charAt(i) == 'L'){
				if(col - 1 >= 0 && arr[row][col-1] == 0){
					arr[row][col-1] = 1;
					recur(arr, row , col-1, str, i + 1);
					arr[row][col-1] = 0;
				}
	
			}
			return;

		}

		if(col == 6){
			if(str.charAt(i) == '?'){
				if(row + 1  < 7 && arr[row+1][col] == 0){
					arr[row+1][col] = 1;
					recur(arr, row  + 1 , col, str, i + 1);
					arr[row+1][col] = 0;
				}
				if(col - 1 >= 0 && arr[row][col-1] == 0){
					arr[row][col-1] = 1;
					recur(arr, row , col-1, str, i + 1);
					arr[row][col-1] = 0;
				}

			} else if(str.charAt(i) == 'L'){
				if(col - 1 >= 0 && arr[row][col-1] == 0){
					arr[row][col-1] = 1;
					recur(arr, row , col-1, str, i + 1);
					arr[row][col-1] = 0;
				}
	
			} else if(str.charAt(i) == 'D'){
				if(row + 1  < 7 && arr[row+1][col] == 0){
					arr[row+1][col] = 1;
					recur(arr, row  + 1 , col, str, i + 1);
					arr[row+1][col] = 0;
				}
	
			}
			return;
		}

		if(str.charAt(i) == '?'){
			if(row - 1 >= 0 && arr[row-1][col] == 0){
				arr[row-1][col] = 1;
				recur(arr, row -1 , col, str, i + 1);
				arr[row-1][col] = 0;
			}

			if(row + 1  < 7 && arr[row+1][col] == 0){
				arr[row+1][col] = 1;
				recur(arr, row  + 1 , col, str, i + 1);
				arr[row+1][col] = 0;
			}

			if(col - 1 >= 0 && arr[row][col-1] == 0){
				arr[row][col-1] = 1;
				recur(arr, row , col-1, str, i + 1);
				arr[row][col-1] = 0;
			}

			if(col  + 1 < 7&& arr[row][col+1] == 0){
				arr[row][col+1] = 1;
				recur(arr, row , col+1, str, i + 1);
				arr[row][col+1] = 0;
			}
		} else if(str.charAt(i) == 'U'){
			if(row - 1 >= 0 && arr[row-1][col] == 0){
				arr[row-1][col] = 1;
				recur(arr, row -1 , col, str, i + 1);
				arr[row-1][col] = 0;
			}
		} else if(str.charAt(i) == 'D'){
			if(row + 1  < 7 && arr[row+1][col] == 0){
				arr[row+1][col] = 1;
				recur(arr, row  + 1 , col, str, i + 1);
				arr[row+1][col] = 0;
			}

		} else if(str.charAt(i) == 'L'){
			if(col - 1 >= 0 && arr[row][col-1] == 0){
				arr[row][col-1] = 1;
				recur(arr, row , col-1, str, i + 1);
				arr[row][col-1] = 0;
			}

		} else if(str.charAt(i) == 'R') {
			if(col  + 1 < 7&& arr[row][col+1] == 0){
				arr[row][col+1] = 1;
				recur(arr, row , col+1, str, i + 1);
				arr[row][col+1] = 0;
			}
		}
	}

	public void solve() throws Exception {
		String str = reader.nextToken();
		int[][] arr = new int[7][7];
		for(int i =0; i < 7; i++){
			for(int j =0; j < 7; j++){
				arr[i][j] = 0;
			}
		}
		arr[0][0] =1;
		recur(arr,0 ,0 , str, 0);

		writer.println(sum);
	}

	public static void main(String[] args) throws Exception{
		GridPaths obj = new GridPaths();
		obj.solve();
		obj.writer.close();
	}

}