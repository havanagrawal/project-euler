//How many Lychrel numbers are there below ten-thousand?

//Ans: 249

import java.math.BigInteger;

class Prob055
{
	public static BigInteger rev (BigInteger t)
	{
		StringBuffer s=new StringBuffer(t.toString());
		s=s.reverse();
		return new BigInteger(s.toString());
	}

	public static void main(String args[])
	{
		long start=System.currentTimeMillis();

		long count=1, lychrel=0, upper=10000;
		long i;
		BigInteger n;
		boolean check=false;

		for (i=1; i<=upper; i++)
		{
			n=new BigInteger((new Long(i)).toString());

			while (check==false && count<50)
			{
				n=n.add(rev(n));

				if (n.compareTo(rev(n))==0)
					check=true;
				else
					count++;
			}

			if (count>=50)
			{
				lychrel++;
				//System.out.println(i+" is Lychrel!");
			}

			count=1;
			check=false;
		}

		long end=System.currentTimeMillis();

		System.out.println("The answer is: "+lychrel);
		System.out.println("Exec. time: "+(end-start));
	}
}