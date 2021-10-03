
import java.util.*;
import java.io.*;

public class ChessboardAndQueens {

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

	int result = 0;

	public void recur(int[][] arr, int row){
		if(row == 8){
			result++;
			return;
		}

		for(int i =0; i < 8 ; i++){
			if(arr[row][i] == 0){
				int[][] temp = cloneChess(arr);
				placeQueen(temp, row, i);
				recur(temp, row+1);
			}

		}

	}

	public void solve() throws Exception{
		int[][] chess = new int[8][8];

		for(int i =0 ; i < 8 ; i++){
			String str = reader.nextToken();
			for(int j =0 ; j < str.length(); j++){
				if(str.charAt(j) == '.'){
					chess[i][j] = 0;
				} else {
					chess[i][j] = 1;
				}
			}
		}


		recur(chess, 0);
		writer.print(result);
	}

	public void placeQueen(int[][] arr, int row, int col){

		for(int i = 0; i < arr.length; i++){
			arr[row][i] = 1;
			arr[i][col] = 1;
		}

		int x = row;
		int y = col;
		while(x < 8 && y < 8){
			arr[x++][y++] = 1;
		}

		x = row;
		y = col;
		while(x >= 0 && y >=0){
			arr[x--][y--] = 1;	
		}

		x = row;
		y = col;
		while(x >= 0 && y < 8){
			arr[x--][y++] = 1;
		}

		x = row;
		y = col;
		while(x < 8 && y >= 0){
			arr[x++][y--] = 1;
		}

	}

	public int[][] cloneChess(int[][] arr){
		int[][] clone = new int[arr.length][arr.length];

		for(int i =0; i< arr.length; i++){
			for(int j =0; j < arr.length; j++){
				clone[i][j] = arr[i][j];
			}
		}
		return clone;
	}

	public static void main(String[] args) throws Exception{
		ChessboardAndQueens obj = new ChessboardAndQueens();
		obj.solve();
		obj.writer.close();
	}
}