package com.dheerajdac.code.cses.SortingAndSearching;

import java.util.*;
import java.io.*;

public class Josephus1 {
    

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

	private int recurr(int n, int k) throws Exception{
		if(n == 1){
			return 1;
		} else {
			int result = (recurr(n-1,k) + k-1) % n + 1;
			writer.print(result + " ");
			return result;
		}
	}
	
    public void solve() throws Exception {
	int n = reader.nextInt();
	recurr(n, 2);
    }

    public static void main(String[] args) throws Exception{
		Josephus1 obj = new Josephus1();
		obj.solve();
		obj.writer.close();
	}
}
