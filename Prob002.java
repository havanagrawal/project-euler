//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

class Prob002
{
	public static void main(String args[])
	{
		int a=0, b=1, c=0, ans=0;
		
		while (c<4000000)
		{
			c=a+b;
			a=b;
			b=c;

			if (c%2==0)
				ans+=c;
		}

		System.out.println((ans)+" is the answer");
	}
}	
			