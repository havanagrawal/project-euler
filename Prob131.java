//1) Using Seive of Eratosthenes for Prime numbers.

//Current Problem: Exec time too long & Precision unsure.

class Prob131
{
	public static boolean isCube(long n)
	{
		long j;
		boolean check=false;

		for (j=1; j<=Math.cbrt(n); j++)
			if (j*j*j==n)
				check=true;

		return check;
	}

	public static void main(String args[])
	{
		int d=1001, p, n, d3, count=0;
		int k=0, i, j;
		boolean check=false, list[]=new boolean[d];

		/*Sieve of Eratosthenes*/

		for (i=0; i<d; i++)
			list[i]=true;	

		for (i=2; i<=d/2; i++)
		{
			if (list[i]==true)
				for (j=2*i; j<d; j+=i)
					list[j]=false;
		}

		for (i=1; i<d; i+=2)
		{
			if (list[i]==true)
				for (n=i/7; n<2*i && check==false; n++)
				{
					if (n!=0)
					{
						d3=(n*n*n) + (n*n*i);
						if (isCube(d3))
						{
							count++;
							check=true;
							System.out.println((n)+", "+(i));
						}
					}
				}
			check=false;
		}
		System.out.println((count));
	}
}
