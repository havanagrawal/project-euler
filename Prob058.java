/*Count -> Total number of diagonal elements
 *Prime -> Total number of primes found
 *rt -> Right top 
 *lt -> Left top
 *lb -> Left bottom
 *rta -> Add to right top
 *lta -> Add to left top
 *lba -> Add to left bottom
 */

//Ans: 26241
class Prob58
{
	public static boolean isPrime(double n)
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

	public static void main(String args[])
	{

		long rt=3, lt=5, lb=7, rta=10, lta=12, lba=14;
		double percent=1.0, count=1, prime=0;

		while (percent>0.10)
		{
			if (isPrime(rt))
				prime++;
			if (isPrime(lt))
				prime++;
			if (isPrime(lb))
				prime++;

			rt+=rta;
			lt+=lta;
			lb+=lba;

			rta+=8;
			lta+=8;
			lba+=8;

			count+=4;

			percent=prime/count;
		}
		System.out.println(((count+1)/2)+" is the answer!");

	}
}