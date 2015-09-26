/*Find the sum of the only eleven primes that are both truncatable from left to right and right to left.*/

// Note(1) - the number has to begin with a 2, 3, 5 or 7.
// Note(2) - The number has to end with a 3 or a 7.
// Note(3) - Current list: 23, 37, 53, 73, 313, 317, 373, 797, 3137, 3797, 739397

//Ans: 748317

class Prob037
{
	public static boolean isPrime(long n)
	{
		long j;
		boolean isPrime=true;
	
		if (n==2 || n==3)
			return true;
		else
		{
			for (j=2; j<=Math.sqrt(n) && isPrime==true; j++)
			{
				if (n%j==0)
					isPrime=false;
			}
			return isPrime;
		}
	}

	public static boolean RightTrunc (long t)	//Will accept only prime numbers.
	{
		while (isPrime(t) && t>10)
			t/=10;

		if (t==2 || t==3 || t==5 || t==7)
			return true;
		else
			return false;
	}

	public static boolean LeftTrunc (long t)
	{
		long i=10, k=t;

		while (k%i!=k)
		{
			if (isPrime(t%i))
				i*=10;
			else 
				return false;	
		}

		return true;
	}

	public static void main(String args[])
	{
		long i=13, d=800000, ans=0;

		while (i<d)
		{
			if (isPrime(i))
				if (RightTrunc(i))
					if (LeftTrunc(i))
					{
						System.out.println(i);
						ans+=i;
					}

			if (i%10==3)
				i+=4;
			else
				i+=6;
		}

		System.out.println("The answer is: "+ans);
	}
}