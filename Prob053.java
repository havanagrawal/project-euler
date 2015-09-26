//How many, not necessarily distinct, values of  nCr, for 1 <= n <= 100, are greater than one-million?
//Ans: 4075

import java.math.*;

class Prob53
{
	static BigInteger fact (BigInteger n)
	{
		BigInteger f=BigInteger.ONE, j;

		for (j=BigInteger.valueOf(1); j.compareTo(n)<=0; j=j.add(BigInteger.valueOf(1)))
			f=f.multiply(j);

		return f;
	}

	public static void main(String args[])
	{
		BigInteger n, r;
		int count=0;

		for (n=BigInteger.valueOf(23); n.compareTo(BigInteger.valueOf(100))<=0; n=n.add(BigInteger.valueOf(1)))
			for (r=BigInteger.valueOf(1); r.compareTo(n)<=0; r=r.add(BigInteger.valueOf(1)))
				if ((fact(n).divide((fact(r).multiply(fact(n.subtract(r))))).compareTo(BigInteger.valueOf(1000000)))==1)
					count++;

		System.out.println("The ans is: "+count);
	}
}
