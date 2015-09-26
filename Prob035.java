//How many circular primes are there below one million?

//Note (1): count is initialized to 2 because the program excludes 2 and 11.

//Ans: 55

class Prob035
{

	public static boolean isPrime(long n)
	{
		int j;
		boolean isPrime=true;

		if (n==2 || n==3)
			return isPrime;

		for (j=2; j<=Math.sqrt(n) && isPrime==true; j++)
		{
			if (n%j==0)
				isPrime=false;
		}
		return isPrime;
	}

	public static int dig(int n)
	{
		int dig=1;
		int a=10;

		while (n%a!=n)
		{
			a*=10;
			dig++;
		}

		return dig;
	}

	public static int rot(int n)
	{
		int dig=dig(n);
		int a=n%10;
		n-=a;
		n/=10;
		n=a*(int)Math.pow(10,(dig-1))+n;

		return n;
	}

	public static void main(String args[])
	{
		long d=1000;
		int i, j;
		int next=0;
		int dig=0, k=0, count=2;

		for (i=3; i<1000000; i+=2)
		{
			next=i;
			dig=dig(i);
			k=0;

			do
			{
				next=rot(next);
				if (isPrime(next))
					k++;
			}
			while (i!=next && isPrime(next));

			if (k==dig)
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println("The ans is: "+count);
	}
}