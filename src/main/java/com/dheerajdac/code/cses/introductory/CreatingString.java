
import java.util.*;
import java.io.*;

public class CreatingString{
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

	public String swap(String str, int i, int j){
		char[] arr = str.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return String.valueOf(arr);
	}

	public void permutate(String str, int start, int end, Set<String> set){

		if(start == end-1){
			set.add(str);
		}

		for(int i = start; i < end; i++){
			permutate(swap(str,i, start), start+1, end, set);
		}
	}

	public void solve() throws Exception {
		String str = reader.nextToken();
		Set<String> result = new HashSet<>();
		permutate(str, 0, str.length(), result);
		
		writer.println(result.size());

		List<String> list = new ArrayList<>(result);
		Collections.sort(list);

		for(String temp : list){
			writer.println(temp);
		}
	}



	public static void main(String[] args) throws Exception{
		CreatingString obj = new CreatingString();
		obj.solve();
		obj.writer.close();
	}
}