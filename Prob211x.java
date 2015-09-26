//lim=6400000
//Ans: 105653478
//Exec time: 135172



class Prob211x
{
	/*Returns if sum of squares of divisors is a perfect square*/
	static long sm;
	static long sq;
	static int odd;
	
	public static boolean sum(long x)	
	{
		sm=1+(x*x);
		sq=(long)Math.sqrt(x);
		odd = (int)x%2;
		
		for (int i=(2+odd); i<sq; i+=(odd+1))
			if (x%i==0)
				sm+=i*i + ((x*x)/(i*i));
		
		if (sq*sq==x)
			sm+=x;
		
		sq=(long)Math.sqrt(sm);
			if (sq*sq==sm)
				return true;

		return false;
	}

	public static void main(String args[])
	{
		long lim=64000000;
		long n;
		long ans=1;							//Algo for sum doesn't work for value '1'
		long start=System.currentTimeMillis();

		
		for (n=1; n<lim; n++)
			if (sum(n))
				ans+=n;

		long end=System.currentTimeMillis();
		System.out.println("Ans: "+ans);
		System.out.print("Exec time: "+(end-start));
	}
}