/*The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330, is unusual in two ways: (i) each of the three terms are prime, and, (ii) each of the 4-digit numbers are permutations of one another.

There are no arithmetic sequences made up of three 1-, 2-, or 3-digit primes, exhibiting this property, but there is one other 4-digit increasing sequence.

What 12-digit number do you form by concatenating the three terms in this sequence?
*/

//Ans: 296962999629

class Prob49
{
	public static boolean isPrime(int n)
	{
		int j;
		boolean isPrime=true;

		for (j=2; j<(n/2); j++)
		{s
			if (n%j==0)
				isPrime=false;
		}
		return isPrime;
	}

	public static boolean checkSum (int a, int b, int c)
	{
		int sum1=0, sum2=0, sum3=0, i;
		boolean checkSum=false;

		while (a!=0&&b!=0&&c!=0)
		{
			sum1+=(a%10);
			sum2+=(b%10);
			sum3+=(c%10);
			a/=10;
			b/=10;
			c/=10;
		}
		if (sum1==sum2&&sum2==sum3)
			checkSum=true;
		return checkSum;
	}

	public static boolean checkDig (int a, int b)
	{
		int aunit=a%10, aten=(a/10)%10, ahun=(a/100)%10, athou=(a/1000), i;
		boolean checkDig=false;

		if ((b%10)==aunit || (b%10)==aten || (b%10)==ahun || (b%10)==athou)
			if (((b/10)%10)==aunit || ((b/10)%10)==aten || ((b/10)%10)==ahun || ((b/10)%10)==athou)
				if (((b/100)%10)==aunit || ((b/100)%10)==aten || ((b/100)%10)==ahun || ((b/100)%10)==athou)
					if ((b/1000)==aunit || (b/1000)==aten || (b/1000)==ahun || (b/1000)==athou)
						checkDig=true;

		return checkDig;
	}
		
		

	public static void main(String args[])
	{
		int i, j, k;

		for (i=1000; i<=9999; i++)
		{
			if (isPrime(i))
			{
				for (j=1; j<5000; j++)
				{
					if (isPrime(i+j))
					{	
						if (isPrime(i+j+j)&&((i+j+j)<10000))
							if (checkSum(i, i+j, i+j+j))
								if (checkDig(i, i+j)&&checkDig(i, i+j+j))
									System.out.println((i)+", "+(i+j)+", "+(i+j+j));
					}
				}
			}
		}
	}
}

