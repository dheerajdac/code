package com.dheerajdac.code.cses.SortingAndSearching;


import java.util.*;
import java.io.*;

public class CollectingNumber2 {

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

	private void swap(int x, int y, int[] pos){
		int temp = pos[x];
		pos[x] = pos[y];
		pos[y] = temp; 
	}

	public void solve() throws Exception {
		int n = reader.nextInt();
		int m = reader.nextInt();
		int[] arr = reader.nextIntArray(n);


		int[] pos = new int[n];

		for(int i =0; i < n ; i++){
			pos[arr[i]-1] = i; 
		}

		for(int j = 0; j < m; j++){
			int x = reader.nextInt();
			int y = reader.nextInt();
			swap(x, y, pos);
			int result = 0;
			for(int i =0 ; i < n - 1; i++){
				if(pos[i] > pos[i+1]){
					result++;
				}
			}
			swap(x, y, pos);
			print(result+1);
		}

	}

	public static void main(String[] args) throws Exception {
		CollectingNumber2 obj = new CollectingNumber2();
		obj.solve();
		obj.writer.close();
	}
	
}
