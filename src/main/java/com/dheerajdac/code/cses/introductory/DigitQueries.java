
import java.util.*;
import java.io.*;

public class DigitQueries {

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

	public void search(long tl, long tu, long n, long i) throws Exception{

		long l = (long)Math.pow(10, i-1);
		long lower = (long)Math.pow(10, i-1);
		long upper = (long)Math.pow(10, i) -1;

		long mid = (upper -lower)/2 + lower;
		long value = (mid - lower + 1)*i + tl;


		while(true){
			if(value - n < i && value - n >= 0){
				break;
			}


			if(value < n){
				lower  = mid +1;
			} else {
				upper = mid -1;
			}
			mid = (upper -lower)/2 + lower;
			value = (mid - l + 1)*i + tl;
		}

		long diff = (i -1) - (value - n);
		writer.println(String.valueOf(mid).charAt((int)diff));
	}


	public void query(long n) throws Exception{
		long k = 0;
		long i = 0;
		long lower = 0;

		while(k < n) {
			lower = k;
			i++;
			k = k + (9 * i * (long)Math.pow(10, i-1));
		}
		search(lower, k, n, i);
	}

	public void solve() throws Exception {
		int n = reader.nextInt();
		for(int i =0 ; i < n ; i++) {
			long temp = reader.nextLong();
			//System.out.println(i + "test" + "   " + temp );
			query(temp);
		}

	}

	public static void main(String[] args) throws Exception{
		DigitQueries obj = new DigitQueries();
		obj.solve();
		obj.writer.close();
	}
}