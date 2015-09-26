class Prob157
{
	public static long GCD(long i, long j)
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
		long x, y;
		long num, den;
		long no_of_sols=0, n=10, t=6, total=0;
		
		long start = System.currentTimeMillis();

		for (n=10; n<=Math.pow(10, t); n*=10)
		{
			for (x=n+1; x<=2*n; x++)
			{
				num=n*x;
				den=x-n;

				if (GCD(num, den)==den)
				{
					no_of_sols++;
					//Find factors of x and y and add to number of solutions.

					y=num/den;
					for (long i=2; i<=x; i++)
					{
						if (x%i==0 && y%i==0)
							no_of_sols++;
					}
				}
			}

			System.out.println("The sols for n="+n+" are: "+no_of_sols);
			total+=no_of_sols;
			no_of_sols=0;
		}

		long end = System.currentTimeMillis();

		System.out.println("The number of solutions for n<="+t+" are: "+total);
		System.out.println("Exec time: "+(end-start));
	}
}