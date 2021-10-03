
import java.util.*;
import java.io.*;


public class AppleDivison{

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

	public void solve1() throws Exception{
		int n = reader.nextInt();
		int[] arr = reader.nextIntArray(n);

		Arrays.sort(arr);

		int sum1 = 0;
		int sum2 = 0;
		for(int i = arr.length-1 ; i >= 0 ; i--){
			if(sum1 > sum2){
				sum2 += arr[i];
			} else {
				sum1 +=arr[i];
			}
		}
		writer.print(Math.abs(sum1-sum2));
	}

	public long recur(int[] arr, int i, long sum, long tSum){
		if(i == arr.length){
			return sum;
		}
		long first = recur(arr, i+1, sum + arr[i],tSum);
		long second = recur(arr, i+1, sum, tSum);

		long sum1 = Math.abs((tSum-first) -first);
		long sum2 = Math.abs((tSum-second) -second);

		return sum1 < sum2 ? first : second;
	}

	public void solve() throws Exception {
		int n = reader.nextInt();
		int[] arr = reader.nextIntArray(n);
		long tSum = 0;
		for(int num : arr){
			tSum += num;
		}
		long sum = recur(arr, 0,0,tSum);
		writer.print( Math.abs((tSum -sum) -sum));
	}

	public static void main(String[] args) throws Exception{
		AppleDivison obj = new AppleDivison();
		obj.solve();
		obj.writer.close();
	}
}