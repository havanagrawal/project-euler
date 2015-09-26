/*How many perfect right-angled triangles with c<=10^16 exist that are not super-perfect?

My Note: Possible answer may be double of what is obtained here, since a and b may be inter-changeable.
My Note (2): All multiples of c which are also square, will satisfy the same conditions. Try to check for this, to shorten time.

*/

class Prob218
{
	public static double GCD(long i, long j)
	{

		while (j!=0)
		{
			if (i>j)
				i-=j;
			else
				j-=i;
		}

		return i;
	}

	public static boolean isSquare(long a)
	{
		boolean isSquare=false;

		for (int i=1; i<=a/2; i++)
			if (i*i==a)
				isSquare=true;

		return isSquare;
	}

	public static void main(String args[])
	{
		long perfect=0, super_perfect=0, a, b, c, max=1, i, ans=0;

		for (i=1; i<17; i++)
			max*=10;

		for (c=1; c<=max; c++)
			for (b=1; b<=max; b++)
				for (a=1; a<=b; a++)
					if ((c*c==a*a+b*b) && isSquare(c) && (GCD(a,b)==1) && (GCD(b,c)==1))
					{
						perfect++;

						if ((a*b/2)%6==0 && (a*b/2)%28==0)
							super_perfect++;
					}


		System.out.println((super_perfect)+" is the answer!");

	}
}