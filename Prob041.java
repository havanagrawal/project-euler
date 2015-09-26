/*We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once. For example, 2143 is a 4-digit pandigital and is also prime.

What is the largest n-digit pandigital prime that exists?
*/
//Tip: n cannot be 9, since Sum(9)=45, hence passing the divisibility test for 3 & 9.
//Tip2: n cannot be 2, 3, 5 , 6 & 8 for the same reasons.
//Tip3: This leaves n=4 and n=7.
//Tip4: The minimum difference between any two n-digit pandigital numbers appears to be 9.
//Ans: 7652413

import java.lang.Math;

class Prob41
{
	public static boolean isPrime(int n)
	{
		int j;
		boolean isPrime=true;
	
		for (j=2; j<Math.sqrt(n) && isPrime==true; j++)
		{
			if (n%j==0)
				isPrime=false;
		}
		return isPrime;
	}

	public static boolean IsPandigital(int n)
	{
		int no_of_digits=1;
		int m=n, k, temp;
		boolean check=true;

		while (m%10!=m)
		{
			no_of_digits++;
			m/=10;
		}

		int array[]=new int[no_of_digits];

		for (k=0; k<no_of_digits; k++)
		{
			array[k]=(n%10);
			n/=10;
		}

		for (k=1; k<2*no_of_digits; k++)
		{
			for (m=0; m<no_of_digits-1; m++)
			{
				if (array[m]>array[m+1])
				{
					temp=array[m];
					array[m]=array[m+1];
					array[m+1]=temp;
				}
			}
		}

		for (k=1; k<=no_of_digits; k++)
			if (array[k-1]!=k)
				check=false;
			
		return check;
	}

	public static void main(String args[])
	{
		int n=1, ans=0;
		boolean check=false;

		for (n=7654321; n>=1234567 && check==false;)
		{
			{
				if (IsPandigital(n))
				{
					if (n%2!=0 && n%3!=0)
					if (isPrime(n))
						{
							ans=n;
							check=true;
						}
					n-=9;
				}
				else
					n--;
			}
		}	

		System.out.println((ans)+" is the answer!");	
	}
}