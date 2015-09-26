/* Find the smallest denominator d, having a resilience R(d) < 15499/94744 */

class Prob243 {
	public static long GCD(long i, long j)
	{
		while (i != 0 && j != 0)
		{
			if (i > j)
				i %= j;
			else
				j %= i;
		}

		if (j == 0)
			return i;
		return j;
	}

	public static void main(String args[]) {
		
		int n = 100000;
		int d;
		long count = 1;
		long res[] = new long[n];
		boolean found = false;
		
		long start = System.currentTimeMillis();
		
		for (d = 3; d < n && !found; d++) {
			for (long k = 2; k < d; k++) {
				if (GCD(k, (long)d) == 1)
					count++;
			}
			res[d] = count;
			count = 1;
			if (94744 * res[d] < 15499 * (d - 1))
				found = true;
		}
		long end = System.currentTimeMillis();	
		System.out.println(res[d - 1] + "/" + (d - 2));
		System.out.println("Time: " + (end - start));
	}
}