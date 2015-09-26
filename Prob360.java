//Current Problem: Execution time is too long. Change strategy.

class Prob360
{
	public static void main(String args[])
	{
		long x, y, z, S=0, count=0;
		long n=10000000000L;

		for (x=0; x<=n; x++)
			for (y=0; y<=n; y++)
				for (z=0; z<=n; z++)
					if (n*n==x*x+y*y+z*z)
					{
						if ((x==0 && y==0) || (x==0 && z==0) || (z==0 && y==0))
							S+=2*(x+y+z);
						else if (x==0 || y==0 || z==0)
							S+=4*(x+y+z);
						else
							S+=8*(x+y+z);
					}


		System.out.println((S)+" is the answer!");

	}
}