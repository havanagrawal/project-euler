/*Euler's Totient function, f(n) [sometimes called the phi function], is used to determine the number of positive numbers less than or equal to n which are relatively prime to n. For example, as 1, 2, 4, 5, 7, and 8, are all less than nine and relatively prime to nine, f(9)=6.
The number 1 is considered to be relatively prime to every positive number, so f(1)=1.

Interestingly, f(87109)=79180, and it can be seen that 87109 is a permutation of 79180.

Find the value of n, 1 < n < 10^7, for which f(n) is a permutation of n and the ratio n/f(n) produces a minimum.
*/

//Ans: 8319823

class Prob070
{
	/* GCD Function*/
	public static int GCD(int i, int j)
	{
		while (i!=0 && j!=0)
		{
			if (i>j)
				i%=j;
			else
				j%=i;
		}

		if (j==0)
			return i;
		else
			return j;
	}

	public static boolean isPerm(int a, int b)
	{
		if (((new Integer(a)).toString()).length() != (new Integer(b).toString()).length())		//If lengths are different
			return false;

		int dig[]=new int[10];

		for (int i=0; i<10; i++)
			dig[i]=0;

		while (a!=0)
		{
			dig[a%10]++;
			a/=10;
		}
		while (b!=0)
		{
			dig[b%10]--;
			b/=10;
		}

		for (int i=0; i<10; i++)
			if (dig[i]!=0)
				return false;

		return true;
	}

	public static void main(String args[])
	{
		int n, phi=1, i, j, k;
		double ans=2.0, finalans=0, temp;
		int upper=10000000;

		long start=System.currentTimeMillis();

		boolean primes[]=new boolean[upper];
		int phis[]=new int[upper];

		for (j=0; j<primes.length; j++)
		{
			primes[j]=true;
			phis[j]=1;
		}

		for (k=2; k<upper; k++)
		{
			if (primes[k]==true)
			{
				for (j=2*k; j<primes.length; j+=k)
					primes[j]=false;
			}
		}

		for (n=2; n<upper; n++)
		{
			phi=n;
			int m=n;

			if (primes[n]==true)
			{
				phi=n-1;
			}
			else if (n%2==0)
			{
				while (m%2==0)
				{
					m/=2;
					if (m%2==0)
						phi=2*phis[m];
					else
						phi=phis[m];
				}
			}
			else if (primes[n]==false)
			{
				for (i=2; i<=Math.sqrt(n); i++)
					if (n%i==0)
						if (GCD (i, n/i)==1)
						{
							phi=phis[i]*phis[n/i];
							break;
						}
			}
			if (phi==n)
			{
				for (i=2; i<=n; i++)
					if (primes[i]==true)
						if (n%i==0)
						{
							phi/=i;
							phi*=(i-1);
						}
			}
			phis[n]=phi;

			if (isPerm (phi, n))
			{
				temp=(double)n/phi;
				if (temp<ans)
				{
					ans=temp;
					finalans=n;
					System.out.println("n = "+n+", Phi(n) = "+phi);
				}
			}
		}

		long end=System.currentTimeMillis();

		System.out.println((finalans)+" is the answer!\n");
		System.out.println("Exec. time: "+(end-start));

	}
}