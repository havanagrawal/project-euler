/*b=2*a;
1) Since h=b+ or - 1, h and a are an odd/even pair. Hence, L is always odd.
2) a+h>L -> a + 2a +-1 >L -> (L-1)>a>(L+1)/3)
3) The values of L for first few runs is 17, 305, 5473, 98209, 1762289, 31622993, 567451585, 10182505537, 182717648081... Hence the multiplying factor of 17. (Actually its 17.9442719099...)
*/

/*New strategy:
h=Rt(L^2 - a^2)
(2a+-1)^2=L^2-a^2
.
.
.
25a^2+-20a+5=5L^2
.
.
.
5L^2-1 =>
i) 8^2, 18^2, 28^2, 38^2....
ii) 12^2, 22^2, 32^2, 42^2....
*/
import java.math.BigInteger;
import java.math.BigDecimal;

class Prob138
{
	//Constants
	static BigDecimal ten = new BigDecimal("10");
	static BigDecimal two = new BigDecimal("2");
	static int scale = 2;
	static BigInteger p;
	static int len;
	//Sqrt function
	public static BigInteger sqrt(BigInteger x)
	{
		BigDecimal t = new BigDecimal(x);
		len = (t.toString()).length();

		BigDecimal g = two.multiply(ten.pow(len/2));
		BigDecimal gprev=g;
		
		for (int i=0; i<6; i++)
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
		/*
		long start=System.currentTimeMillis();
		boolean check=false;

		while (count<1)	{
			for (L=(long)(ans*(17.94)); check==false; L+=2)	{ //(1), (3)
				if (L%2==0)
					L--;

				for (a=(L/3); a<L && check==false; a++)	{	//(2)
					h=2*a+1;
					if (h*h+a*a==L*L) {
						count++;
						sumL+=L;
						ans=L;
						check=true;
					}
					h=2*a-1;
					if (h*h+a*a==L*L && check==false) {
						count++;
						sumL+=L;
						ans=L;
						check=true;
					}
				}				
			}
			check=false;
		}

		long end=System.currentTimeMillis();
		System.out.println((ans));
		System.out.println("Execution time: "+(end-start));
		*/
		long start=System.currentTimeMillis();
		BigInteger a, l;
		BigInteger modu;
		
		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		BigInteger three = new BigInteger("3");
		BigInteger sev = new BigInteger("7");
		BigInteger ten = new BigInteger("10");
		BigInteger eight = new BigInteger("8");
		BigInteger multi = new BigInteger ("321");
		BigInteger five = new BigInteger("5");
		BigInteger twelve = new BigInteger("12");
		BigInteger size = new BigInteger("10000000000000");
		BigInteger rt;
		
		for (a=eight; a.compareTo(size)<=0; a=a.add(ten)) {
			l=((a.multiply(a)).add(one)).divide(five);
			
			modu=l.mod(ten);
			if (!((modu.compareTo(two))==0 || (modu.compareTo(three))==0 || (modu.compareTo(sev))==0 || (modu.compareTo(eight))==0)) {
				rt=sqrt(l);
				if (rt.multiply(rt).compareTo(l)==0) {
					System.out.println(rt);
					a=a.multiply(multi);					
				}
			}
		}
		for (a=twelve; a.compareTo(size)<=0; a=a.add(ten)) {
			l=((a.multiply(a)).add(one)).divide(five);
			
			modu=l.mod(ten);
			if (!((modu.compareTo(two))==0 || (modu.compareTo(three))==0 || (modu.compareTo(sev))==0 || (modu.compareTo(eight))==0)) {
				rt=sqrt(l);
				if (rt.multiply(rt).compareTo(l)==0) {
					System.out.println(rt);
					a=a.multiply(multi);
				}
			}
		}
		long end=System.currentTimeMillis();
		System.out.println("Execution time: "+(end-start));
	}
}