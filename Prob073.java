//How many fractions lie between 1/3 and 1/2 in the sorted set of reduced proper fractions for d <= 12,000?
//Ans: 7295372

class Prob073
{
	public static int GCD(int i, int j)
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
	
	public static void main(String args[])
	{
		int n, d, count=0;

		for (d=1; d<=12000; d++)
			for (n=1; n<d; n++)
				if ((GCD(n, d)==1) && (double)n/(double)d<(double)1/2 && (double)n/(double)d>(double)1/3)
					count++;

		System.out.println((count)+" is the answer!");

	}
}