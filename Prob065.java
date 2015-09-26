//Ans: 272

import java.math.BigInteger;

class Prob065
{

	public static void main(String args[])
	{
		int n=0;
		int i=0;
		int p=1;
		int ans=0;
		
		BigInteger h[] = new BigInteger[101];
		BigInteger at;
	//	long k[]=new long[101];
		long a[]=new long[101];
		
		a[0]=2;
		
		h[n]=new BigInteger("2");
	//	k[n]=1;
		
		n++;
		
		h[n]=new BigInteger("3");
	//	k[n]=1;
		
		for (i=1; i<=100; i++)
		{
			if ((i+1)%3==0)
			{
				a[i]=2*p;
				p++;
			}
			else
			a[i]=1;
		}
		
	//	for (n=0; n<=1; n++)
	//		System.out.println(h[n]);
			
		for (n=2; n<100; n++)
		{
			at = new BigInteger (""+a[n]);
			
			h[n] = (at.multiply(h[n-1])).add(h[n-2]);			//h[n]=a[n]*h[n-1] + h[n-2];
						
		//	k[n]=a[n]*k[n-1] + k[n-2];

			//System.out.println(h[n]);
		}
		
		String s = (h[n-1]).toString();
		
		for (i=0; i<s.length(); i++)
			ans+=s.charAt(i)-'0';
		
		System.out.println("The answer is: "+(ans));
		
	}
}