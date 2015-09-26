//How many elements would be contained in the set of reduced proper fractions for d <= 1,000,000?
//http://en.wikipedia.org/wiki/Farey_sequence#Sequence_length
//Ans:303963552391

class Prob072
{
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
	
	public static void main(String args[])
	{
		int n, phi=1, i, j, k;
		int upper=1000001;			//Upper=length + 1
		long sum=0;

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
				m/=2;
				if (m%2==0)
					phi=2*phis[m];
				else
					phi=phis[m];
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
			//System.out.println("n = "+n+", Phi(n) = "+phis[n]);
			sum+=phi;
		}

		long end=System.currentTimeMillis();

		System.out.println((sum)+" is the answer!\n");
		System.out.println("Exec. time: "+(end-start));
	}
}