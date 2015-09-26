/*The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify it may incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s.

We shall consider fractions like, 30/50 = 3/5, to be trivial examples.

There are exactly four non-trivial examples of this type of fraction, less than one in value, and containing two digits in the numerator and denominator.

If the product of these four fractions is given in its lowest common terms, find the value of the denominator.
*/

class Prob33
{
	public static double check(int numc, int denc)
	{
		int i=(numc%10), j=(numc/10), k=(denc%10), l=(denc/10);
		double ret;
		if (i==k)
			ret=(double)j/l;
		else if (i==l)
			ret=(double)j/k;
		else if (j==k)
			ret=(double)i/l;
		else if (j==l)
			ret=(double)i/k;
		else
			ret=0.0;

		return ret;
	}

	public static double reduce(int numc, int denc)
	{
		int i=numc, j=denc;
		double ret;

		while (j!=0)
		{
			if (i>j)
				i-=j;
			else
				j-=i;
		}
		numc/=i;
		denc/=i;

		ret=(double)numc/denc;

		return (ret);
	}

	public static void main(String args[])
	{
		int den=99, num=11;

/*		double k=reduce(num, den);
		System.out.println(k);
		den--; num=49;
		k=check(num, den);
		System.out.println(k);
*/
		for (; den>10; den--)
		{
			for (num=11; num<den; num++)
			{
				if ((check(num, den)==reduce(num, den))&&(num%10!=0))
					System.out.println((num)+"/"+(den));
			}
		}

	}
}