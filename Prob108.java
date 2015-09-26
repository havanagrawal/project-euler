// Equation: 1/x + 1/y = 1/n
// Range of x is (n, 2n]
// The consistency shows that the no. of solutions increase for all even numbers.
// Further, they show that after n=6, for all next higher no. of solutions, n is a multiple of 6.
// This carries on for multiples of 10, and then later multiples of 60.

//Ans: 180180

class Prob108
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
		long x, n=2, no_of_sols=0, num, den, prev=0;

		long start=System.currentTimeMillis();

		while (no_of_sols<1000)
		{
			no_of_sols=0;

			for (x=n+1; x<=2*n; x++)
			{
				den=n*x;
				num=x-n;

				if (GCD(num, den)==num)
					no_of_sols++;
			}

			if (no_of_sols>prev)
			{
				System.out.println("For n = "+n+", No. of solutions = "+(no_of_sols));
				prev=no_of_sols;
			}

			if (n>=360)
				n+=60;
			else if (n>=30)
				n+=30;
			else
				n+=2;
		}
		long end=System.currentTimeMillis();

		System.out.println("Exec time: "+(end-start));

	}

}