/*Find the last 10 digits of 1^1 + 2^2 + 3^3...... +1000^1000*/
//Ans: 9110846700

import java.math.BigInteger;

class Prob048
{
	public static void main(String args[])
	{
		BigInteger a=new BigInteger("1");

		BigInteger sum=new BigInteger("0");

		for (int k=1; k<=1000; k++)
		{
			sum=sum.add(a.pow(k));
			a=a.add(BigInteger.ONE);
		}

		sum=sum.mod(new BigInteger("10000000000"));

		System.out.println("The answer is: "+sum);
	}
}