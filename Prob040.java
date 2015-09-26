/*An irrational decimal fraction is created by concatenating the positive integers:

0.123456789101112131415161718192021...

If dn represents the nth digit of the fractional part, find the value of the following expression.

d1 × d10 × d100 × d1000 × d10000 × d100000 × d1000000
*/

//Ans: 210

class Prob040
{
	public static void main(String args[])
	{
		
		int i;
		String s;
		StringBuffer s1=new StringBuffer();

		long start=System.currentTimeMillis();

		for (i=1; i<1000000; i++)
			s1=s1.append(i);

		long end=System.currentTimeMillis();
		System.out.println("Exec time: "+(end-start));
		
		for (i=1; i<=1000000; i*=10)
			System.out.println((s1.toString()).charAt(i-1));		
	}
}