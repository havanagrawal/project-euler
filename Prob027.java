/*Considering quadratics of the form:

    n^2 + an + b, where |a| < 1000 and |b| < 1000

    where |n| is the modulus/absolute value of n
    e.g. |11| = 11 and |-4| = 4

Find the product of the coefficients, a and b, for the quadratic expression that produces the maximum number of primes for consecutive values of n, starting with n = 0.
*/

//Since n starts from 0, b must be +ve, and prime, hence starts with 2.
//Ans: -59231

class Prob27
{
	public static boolean isPrime(int n)
	{
		int j;
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

	public static void main(String args[])
	{
		int a, b, n, count=1, prev_count=0, ans=0;
		boolean check=false;

		for (a=-999; a<1000; a++)
		{	
			for (b=2; b<1000; b++)
			{
				if (isPrime(b))
				{
					for (n=1; check==false; n++)
					{
						if ((n*n+a*n+b)>0 && isPrime(n*n+a*n+b))
							count++;
						else
							check=true;
					}

					if (count>prev_count)
					{
						prev_count=count;
						ans=a*b;
					}
				}

				count=1;
				check=false;
			}
		}

		System.out.println("Ans is: "+(ans)+"\nCount is: "+(prev_count));
	}
}