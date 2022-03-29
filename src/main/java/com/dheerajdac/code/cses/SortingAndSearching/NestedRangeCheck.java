package com.dheerajdac.code.cses.SortingAndSearching;


import java.io.*;
import java.util.*;

public class NestedRangeCheck {


	private class Node implements Comparable<Node>{

		public Node(int x, int y, int index){
			this.x= x;
			this.y = y;
			this.index = index;
		}

		int x;
		int y;
		int index;
		int outer = 0;
		int inner = 0;

		@Override
		public int compareTo(Node o) {
			if(x == o.x){
				return this.y - o.y;
			}
			return x - o.x;
		}

	}
	public void solve() throws Exception{
		int n = reader.nextInt();
		List<Node> list = new ArrayList<>(n);
		List<Node> list2 = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			Node node = new Node(reader.nextInt(), reader.nextInt(), i);
			list.add(node);
			list2.add(node);
		}

		Collections.sort(list);

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			Node first = list.get(i);
			if(first.y <= max){
				first.inner = 1;
			} else {
				max = first.y;
			}
			Node second = list.get(n-1-i);
			if(second.y >= min){
				second.outer = 1;
			} else {
				min = second.y;
			}
		}
		

		StringBuilder b1 = new StringBuilder();
		StringBuilder b2 = new StringBuilder();


		for (Node node : list2) {
			b1.append(node.outer + " ");
			b2.append(node.inner + " ");
		}
		
		b1.append("\n");
		b1.append(b2);

		writer.print(b1.toString());

	}
	
	public static void main(String[] args) throws Exception{
		NestedRangeCheck obj = new NestedRangeCheck();
		obj.solve();
		obj.writer.close();
	}
	
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


}
