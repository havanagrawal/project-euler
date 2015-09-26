//Find how many Cardano Triplets exist such that a+b+c <= 110,000,000

import java.lang.Object;

class Prob251
{
	public static double Round(double Rval, int Rpl)
	{
		double p = (double)Math.pow(10,Rpl);
		Rval = Rval * p;
		double tmp = Math.round(Rval);
		return (double)tmp/p;
	}

	public static void main(String args[])
	{
		double term1, term2;
		long a, b, c, count=0;
		
		for (a=1; a<=109999998; a++)
		{
			for (b=1; b<=109999998; b++)
			{
				for (c=1; c<=110000000-a-b; c++)
				{
					term1=Math.cbrt(a+b*(Math.sqrt(c)))+Math.cbrt(a-b*(Math.sqrt(c)));
					term2=Round(term1, 14);
					if (term2==1.00000000000000)
						count++;
					
				}
			}
		}
	
		System.out.println((count)+" is the answer!");

	}
}