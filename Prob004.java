//Find the largest palindrome made from the product of two 3-digit numbers.

class Prob004
{
	public static void main(String args[])
	{
		int i=999, j=999, k, rev=0, ans=0, ans1, d;
		
		for (i=999; i>=100; i--)
		{
			for (j=999; j>=100; j--)
			{
				rev=0;
				ans1=i*j;
				k=ans1;

				while(k!=0)
				{
					d=k%10;
					rev=10*rev + d;
					k=k/10;
				}
				if ((rev==ans1)&&(ans1>ans))
				ans=ans1;
			}
		}
		System.out.println((ans)+" is the answer!");
	}
}
