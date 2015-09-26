//Find the sum of all the multiples of 3 or 5 below 1000.

class Prob001
{
	public static void main (String args[])
	{
		int i, j=0;

		for (i=1; i<1000; i++)
		{
			if (i%3==0 || i%5==0)
				j+=i;
		}
		System.out.println((j)+" is the answer");
	}
}