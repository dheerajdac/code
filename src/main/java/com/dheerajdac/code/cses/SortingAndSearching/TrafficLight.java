package com.dheerajdac.code.cses.SortingAndSearching;


import java.util.*;
import java.io.*;

public class TrafficLight {

	private class Node implements Comparable<Node>{
		private Node(int x, int y){
			this.x = x;
			this.y = y;
			this.diff = y -x;
		}
		int x;
		int y;
		int diff;

		@Override
		public boolean equals(Object o){
			if(o == this){
				return true;
			}

			if(o == null || o.getClass() != this.getClass()){
				return false;
			}

			return ((Node)o).x == this.x;
		}

		@Override
		public int compareTo(Node o) {
			if(o == null) {
				return -1;
			}

			if(this == o){
				return 0;
			}

			return this.diff - o.diff;
		}

		@Override
		public int hashCode(){
			return x;
		}
	}

	private class test implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			return 0;
		}

	}
    public void solve() throws Exception {
	int length = reader.nextInt();
	int n = reader.nextInt();

	int[] arr = reader.nextIntArray(n);

	Node root = new Node(0, length);

	TreeMap<Node,Node> set = new TreeMap<>();

	TreeMap<Integer, Node> map = new TreeMap<>();

	set.put(root,root);
	map.put(0, root);

	for(int val : arr){

		if(!map.containsKey(val)){
			
			Map.Entry<Integer, Node> entry = map.lowerEntry(val);

			Node temp = entry.getValue();
			
			Node first = new Node(entry.getValue().x, val);

			Node second = new Node(val, entry.getValue().y);
			
			set.remove(temp);
			set.put(first,first);
			set.put(second,second);

			map.remove(entry.getValue().x);
			map.put(entry.getValue().x, first);
			map.put(val, second);
		}

		writer.print(set.lastEntry().getValue().diff + " ");

	}

    }

    	public static void main(String[] args) throws Exception{
		TrafficLight obj = new TrafficLight();
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
