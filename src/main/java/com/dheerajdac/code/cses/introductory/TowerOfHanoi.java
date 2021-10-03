

import java.io.*;
import java.util.*;

public class TowerOfHanoi {

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

		int[] nextIntArray() throws Exception {
			String[] input = nextToken().split(" ");
			int[] result = new int[input.length];

			for(int i = 0 ; i < input.length; i++){
				result[i] = Integer.valueOf(input[i]);
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

	private void recur(int n, int from, int aux, int to, List<List<Integer>> result){
		if(n==1){
			List<Integer> temp = new ArrayList<>();
			temp.add(from);
			temp.add(to);
			result.add(temp);
			return;
		}

		recur(n-1, from, to, aux,result);
		List<Integer> temp = new ArrayList<>();
		temp.add(from);
		temp.add(to);
		result.add(temp);
		recur(n-1, aux, from, to,result);
	}

	public void solve() throws Exception{
		int n = reader.nextInt();
		List<List<Integer>> result = new ArrayList<>();
		recur(n,1,2,3,result);
		writer.println(result.size());

		for(List<Integer> temp : result){
			writer.println(temp.get(0) + " " + temp.get(1));
		}
	}

	public static void main(String[] args) throws Exception{
		TowerOfHanoi obj = new TowerOfHanoi();
		obj.solve();
		obj.writer.close();
	}


}