//P(n, list) = P(n - list(0), list) + P(n, list.remove(0))

import java.util.*;
import java.math.BigInteger;

class Prob078 {
	
	static int n = 1000;
	static BigInteger[][] noOfWays = new BigInteger[n + 1][n + 1];
	
	static BigInteger zero = BigInteger.ZERO;
	static BigInteger one = BigInteger.ONE;
	/*
	 * Given numbers from 1 to main
	 * How many ways can you write n as a sum of any of these numbers
	 */
	public static BigInteger noOfWaysOfPartitions(int n, int m) {
		if (noOfWays[n][m] == null) {
			if (n == 0) {
				return one;
			}
			if (m == 0) {
				return zero;
			}
			if (n < m) {
				return noOfWaysOfPartitions(n, n);
			}
			else {
				noOfWays[n][m] = noOfWaysOfPartitions(n - m, m).add(noOfWaysOfPartitions(n, m - 1));
				return noOfWays[n][m];
			}
		}
		else {
			return noOfWays[n][m];
		}
		
	}
	
	public static void main(String[] args) {
		int i = 1;
		int ans = 0;
		BigInteger million = new BigInteger("1000000");
		
		long time = System.currentTimeMillis();
		for (int k = 0; k <= n; k++) {
			for (int j = 0; j <= n; j++) {
				noOfWays[k][j] = zero;
			}
		}
		
		for (int k = 1; k <= n; k++) {
			noOfWays[0][k] = one;
			noOfWays[k][0] = zero;
			noOfWays[1][k] = one;
		}
		
		for (int k = 1; k <= n; k++) {
			for (int j = 1; j <= k; j++) {
				noOfWays[k][j] = noOfWays[k - j][j].add(noOfWays[k][j - 1]);
			}
			for (int j = k + 1; j <= n; j++) {
				noOfWays[k][j] = noOfWays[k][k];
			}
		}
		
		
		while (i <= n && ans == 0) {
			BigInteger temp = noOfWays[i][i];
			//System.out.println(i + "\t" + temp);
			i++;
			
			if (temp.mod(million).equals(zero)) {
				ans = i;
			}
		}
		time = System.currentTimeMillis() - time;
		
		System.out.println(time + "\t" + ans);
	}
}