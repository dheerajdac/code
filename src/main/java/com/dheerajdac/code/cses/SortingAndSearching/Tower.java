package com.dheerajdac.code.cses.SortingAndSearching;

import java.util.*;
import java.io.*;

public class Tower {
    

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

	private class Node implements Comparable{

		Integer value;

		@Override
		public int compareTo(Object o) {
			if(o == null){
				return -1;
			}

			return this.value.compareTo(((Node) o).value);
		}

	}
    public void solve() throws Exception {
	int n = reader.nextInt();
	int[] arr = reader.nextIntArray(n);

	LinkedList<Node> list = new LinkedList<>();

	for(int val : arr){
		Node last = null;
		for(Node temp: list){
			if(val >= temp.value){
				break;
			} else {
				last = temp;
			}
		}

		if(last == null){
			Node test = new Node();
			test.value = val;
			list.addFirst(test);
		} else {
			last.value = val;
		}
	}

	writer.print(list.size());

    }

    public static void main(String[] args) throws Exception{
		Tower obj = new Tower();
		obj.solve();
		obj.writer.close();
	}
}
