//What is the 10 001st prime number?

class Prob7
{
	public static boolean isPrime (int x) {
		for (int j=2; j<=Math.sqrt(x); j++) {
			if (x%j==0)
				return false;
		}
		return true;
	}
	public static void main(String args[])
	{
		long start = System.currentTimeMillis();
		
		int i, j, ans, count=1;
		boolean check=true;


		for (i=3; count!=100001; i++)
			if (isPrime(i))
				count++;

		ans=i-1;
		long end = System.currentTimeMillis();
		System.out.println("Exec time: "+(end-start));
		System.out.println((ans)+" is the answer!");
	}
}

		
