//Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.

//ans: 872187

import java.math.*;

class Prob36
{
	public static BigInteger Pow(long n)		//10^n
	{
		BigInteger m=BigInteger.ONE;

		for (int j=1; j<=n; j++)
			m=m.multiply(BigInteger.valueOf(10));

		return m;
	}
	
	public static BigInteger toBinary (long a)
	{
		long i, j, n=0;
		BigInteger b=BigInteger.ZERO;
		boolean check=true;

		while (a!=0)
		{
			for (i=0; i<=60 && check==true; i++)
			{
				if (a>=(Math.pow(2,i)))
					n=i;
				else
					check=false;
			}
			
			b=b.add(Pow(n));						//b = b + 10^n
			a=(a-((long)Math.pow(2,n)));					//a-=2^n
			check=true;
		}
		
		return b;
	}

		

	public static boolean isPalindrome(BigInteger n)
	{
		BigInteger m=n, d=BigInteger.ZERO;
		
		while (!((n.compareTo(BigInteger.ZERO))==0))						//n!=0
		{
			d=(d.multiply(BigInteger.valueOf(10))).add(n.mod(BigInteger.valueOf(10)));	//d = 10*d + n%10
			n=n.divide(BigInteger.valueOf(10));						//n/=10;
		}
	
		if (m.compareTo(d)==0)
			return true;
		else
			return false;
		
	}

	public static void main(String args[])
	{
		int i=0;
		long count=0;
		long sum=0;

		for (i=1; i<1000000; i+=2)
			if (isPalindrome(BigInteger.valueOf(i)))
				if (isPalindrome(toBinary(i)))
				{
					sum+=i;
					count++;
					System.out.println((i)+" "+(toBinary(i)));
				}
//		System.out.println(toBinary(1000000));
		System.out.println("The answer is: "+sum);

	}
}