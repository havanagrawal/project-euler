/*The following iterative sequence is defined for the set of positive integers:
n -> n/2 (n is even)
n -> 3n + 1 (n is odd)
Which starting number, under one million, produces the longest chain? */

class Prob14
{
	public static void main(String args[])
	{
		int i, count=0, m=0;
		long n=0, ans=0;

		for (i=1; i<1000000; i++)
		{
			n=i;
			while (n!=1)
			{
				if (n%2==0)
				{
					n=n/2;
					count++;
				}
				else
				{
					n=3*n+1;
					count++;
				}
			}
			if (count>m)
			{
				m=count;
				ans=i;
			}
			count=0;
		}
		System.out.println((ans)+" is the answer!");

	}
}