//Continued fraction of sqrt(2).
//The numerator is given by 2*prenum + ppnum;
//The denominator is given by  prenum+preden;

//Ans: 153

import java.math.*;

class Prob057
{
	public static void main(String args[])
	{
		BigInteger num=new BigInteger("3");
		BigInteger den=new BigInteger("2");
		BigInteger pnum, pden;
		BigInteger ppnum=new BigInteger("1");
		BigInteger two=new BigInteger("2");

		int count=0;


		for (int i=0; i<999; i++)
		{
			pnum=num;
			pden=den;
			den=pnum.add(pden);
			num=(two.multiply(pnum)).add(ppnum);
			ppnum=pnum;

			String n=num.toString();
			String d=den.toString();

			if (n.length()>d.length())
				count++;
		}
		System.out.println("The answer is: "+count);
	}
}