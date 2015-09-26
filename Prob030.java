/*Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.*/

//Upper limit: 6*(9^5) < 999999, 5*(9^5)>99999

//Ans: 443839

class Prob30
{
	public static void main(String args[])
	{
		int sum=0, i, t, a, ans=0;

		for (i=2; i<999999; i++)
		{
			t=i;

			while (t!=0)
			{
				a=t%10;
				sum+=Math.pow(a, 5);
				t/=10;
			}

			if (sum==i)
			{
				System.out.println(i);
				ans+=i;
			}

			sum=0;
		}

		System.out.println("The answer is: "+ans);
	}
}