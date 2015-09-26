import java.math.*;

/*Find the sum of the digits in the number 100!*/
//Ans: 648

class Prob20
{
	public static void main(String Args[])
	{
		BigInteger b=BigInteger.ONE;
		BigInteger sum=BigInteger.ZERO, temp;
		int i;

		for (i=1; i<=100; i++)
			b=b.multiply(BigInteger.valueOf(i));

		while ((b.remainder(BigInteger.valueOf(10))).compareTo(BigInteger.valueOf(0))>0)
			b=b.divide(BigInteger.valueOf(10));

		while ((b.compareTo(BigInteger.ZERO))>0)
		{
			temp=b.remainder(BigInteger.valueOf(10));
			sum=sum.add(temp);
			b=b.divide(BigInteger.valueOf(10));
		}

		System.out.println("Sum of digits in "+b+"! is "+sum);
	}
}