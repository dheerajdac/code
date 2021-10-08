
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class Apartments {
    

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

    public void solve() throws Exception {
        int n = reader.nextInt();
		int m = reader.nextInt();
		int k = reader.nextInt();

        int[] arr = reader.nextIntArray(n);
		int[] app = reader.nextIntArray(m);

		int i =0;
		int j =0;
		int result =0;
		Arrays.sort(arr);
		Arrays.sort(app);
		while( i < arr.length && j < app.length){
			//println( arr[i] + "  " + app[j]);
			if(arr[i] >= app[j] - k && arr[i] <= app[j]+k){
				result++;
				i++;
				j++;
			} else {
				if(arr[i] < app[j]){
					i++;
				} else {
					j++;
				}
			}
		}
        writer.println(result);
    }

    public static void main(String[] args) throws Exception{
		Apartments obj = new Apartments();
		obj.solve();
		obj.writer.close();
	}
}
