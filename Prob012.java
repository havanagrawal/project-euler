//What is the value of the first triangle number to have over five hundred divisors?

class Prob12
{
	public static void main(String args[])
	{
		int n=0, count=0, i, j;

		for (j=1; (j<2147483647)&&(count<500); j++)
		{
			n=(j*(j+1))/2;
			count=0;

			for (i=1; i<=n; i++)
				if (n%i==0)
					count++;
		}

		System.out.println((n)+" is the answer!");

	}
}