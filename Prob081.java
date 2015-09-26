import java.io.*;

class Prob081 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("p081_matrix.txt"));
		
		int i, j;
		int n = 80;
		int[][] matrix = new int[n][n];
		String[][] s = new String[n][];
		
		for (i = 0; i < n; i++) {
			s[i] = (br.readLine()).split(",");
		}
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				matrix[i][j] = Integer.parseInt(s[i][j]);
			}
		}
		
		for (j = 1; j < n; j++) {
			matrix[0][j] += matrix[0][j - 1];
		}
		
		for (i = 1; i < n; i++) {
			matrix[i][0] += matrix[i - 1][0];
		}
		
		for (i = 1; i < n; i++) {
			for (j = 1; j < n; j++) {
				matrix[i][j] += Math.min(matrix[i - 1][j], matrix[i][j - 1]);
			}
		}
		System.out.println(matrix[n - 1][n - 1]);
		br.close();
	}
}