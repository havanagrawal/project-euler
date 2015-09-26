//Evaluate the sum of all the amicable numbers under 10000.

class Prob21
{
	public static boolean isAmicable(int n)
	{
		int j, sum1=0, sum2=0;
		boolean ret=false;

		for (j=1; j<n; j++)
			if (n%j==0)
				sum1+=j;

		for (j=1; j<sum1; j++)
			if (sum1%j==0)
				sum2+=j;

		if (n==sum2 && sum1!=n)
			ret=true;

		return ret;

	}

	public static void main(String args[])
	{
		int i=1, sum_of_amicable=0;

		for (i=1; i<10000; i++)
			if (isAmicable(i))
				sum_of_amicable+=i;

		System.out.println((sum_of_amicable)+" is the answer!");

	}
}