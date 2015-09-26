import java.math.BigInteger;
import java.math.BigDecimal;

//By finding the first arrangement to contain over 10^12 = 1,000,000,000,000 discs in total, determine the number of blue discs that the box would contain.
/*Let b be no. of blue discs
  Let n be no. of total discs
  b(b-1) = n(n-1)/2 = k (say)
  Solving, we get, 1+4k must be a perfect square.
  Also, 1+8k must be a perfect square.
  Series of k for this is, 0, 6, 210, 7140... (http://oeis.org/A029549)
  Now, minimum value of k is 5*(10^23). Hence find next value of series, greater than this.
  Also, k must be even (in the 0, 1, 3, 6, 10, 15... series, we want values of k whose half also exists in the series)
*/

// Solved in Python, much faster. See Prob100 in Python/Euler/ folder
class Prob100
{
	//Constants
	static BigDecimal ten = new BigDecimal("10");
	static BigDecimal two = new BigDecimal("2");
	static int scale = 3;
	//Sqrt function
	
	public static BigInteger sqrt(BigInteger x)
	{
		//Guess random number, say g.
		//gprev=g
		//g=((n/g)+g)/2
		//If gprev==g, g is the approximate root.

		BigDecimal t = new BigDecimal(x);
		int l = (t.toString()).length();

		BigDecimal g = two.multiply(ten.pow(l/2));
		BigDecimal gprev=g;
		
		for (int i=0; i<15; i++)
		{
			gprev=g;
			g = (((t.divide(g, scale, BigDecimal.ROUND_HALF_UP)).add(g)).divide(two, scale, BigDecimal.ROUND_HALF_UP));
			if (gprev.compareTo(g)==0)
				break;
		}
			
		return g.toBigInteger();		
	}

	public static void main(String args[])
	{
		long start=System.currentTimeMillis();
		
		BigInteger n = new BigInteger("0");
		BigInteger b = new BigInteger("0");

		BigInteger one =new BigInteger ("1");
		BigInteger two = new BigInteger("2");
		BigInteger five = new BigInteger("5");
		BigInteger four = new BigInteger("4");
		BigInteger eight = new BigInteger("8");
		BigInteger ten = new BigInteger("10");
		
		BigInteger cd = one;	//Common difference
		BigInteger k = BigInteger.ZERO;
		
		BigInteger limit = five.multiply(ten.pow(14));
		BigInteger sq1 = BigInteger.ZERO;
		BigInteger sq2 = BigInteger.ZERO;
		BigInteger val = BigInteger.ZERO;
		int i;
		
		boolean found = false;
		
		//Method 1
		
		while (k.compareTo(limit)<0)		//k < limit
		{
			do
			{
				k=k.add(cd);
				cd=cd.add(one);
			}
			while ((k.mod(two)).compareTo(BigInteger.ZERO)!=0);
			// Progresses through 2 values of k, to get only even values.
		}

		while (found!=true)
		{
			sq2 = sqrt((k.multiply(four)).add(one));
			
			if ((sq2.multiply(sq2)).compareTo((k.multiply(four)).add(one))==0)
			{
				sq1 = sqrt((k.multiply(eight)).add(one));
				if ((sq1.multiply(sq1)).compareTo((k.multiply(eight)).add(one))==0)
				{
					System.out.println(k+", "+cd);
					val=k;
					found=true;
				}
			}
			do
			{
				k=k.add(cd);
				cd=cd.add(one);
			}
			while ((k.mod(two)).compareTo(BigInteger.ZERO)!=0);
		}
		
		long end=System.currentTimeMillis();
		
		BigInteger det=sqrt(one.add(val.multiply(eight)));		//det=rt(1+8k)
		BigInteger det2=sqrt(one.add(val.multiply(four)));		//det2=rt(1+4k)
		b = ((one).add(det2)).divide(two);
		n = ((one).add(det)).divide(two);						//n=(1+rt(1+8k))/2
		System.out.println("The value of n is: "+n);
		System.out.println("The value of b is: "+b);
		System.out.println("Exec time: "+(end-start));
		
	}
}